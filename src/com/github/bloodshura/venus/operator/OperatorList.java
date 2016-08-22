//////////////////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2016, João Vitor Verona Biazibetti - All Rights Reserved                /
//                                                                                       /
// Licensed under the GNU General Public License v3;                                     /
// you may not use this file except in compliance with the License.                      /
//                                                                                       /
// You may obtain a copy of the License at                                               /
//     http://www.gnu.org/licenses/gpl.html                                              /
//                                                                                       /
// Unless required by applicable law or agreed to in writing, software                   /
// distributed under the License is distributed on an "AS IS" BASIS,                     /
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.              /
// See the License for the specific language governing permissions and                   /
// limitations under the License.                                                        /
//                                                                                       /
// Written by João Vitor Verona Biazibetti <joaaoverona@gmail.com>, March 2016           /
// https://www.github.com/BloodShura                                                     /
//////////////////////////////////////////////////////////////////////////////////////////

package com.github.bloodshura.venus.operator;

import com.github.bloodshura.venus.value.TypeValue;
import com.github.bloodshura.venus.value.Value;
import com.github.bloodshura.x.collection.view.XView;
import com.github.bloodshura.x.worker.enumeration.Enumerations;

/**
 * OperatorList.java
 *
 * @author <a href="https://www.github.com/BloodShura">BloodShura</a> (João Vitor Verona Biazibetti)
 * @contact joaaoverona@gmail.com
 * @date 07/05/16 - 19:49
 * @since GAMMA - 0x3
 */
public class OperatorList {
  public static final BinaryOperator AND = new BinaryOperator("and", Value::and, "&&", "&");
  public static final BinaryOperator DIVIDE = new BinaryOperator("divide", Value::divide, "/");
  public static final BinaryOperator EQUALS = new BinaryOperator("equals", Value::equals, "==");
  public static final BinaryOperator HIGHER_EQ_THAN = new BinaryOperator("higherEqualThan", Value::higherEqualThan, ">=");
  public static final BinaryOperator HIGHER_THAN = new BinaryOperator("higherThan", Value::higherThan, ">");
  public static final BinaryOperator LOWER_EQ_THAN = new BinaryOperator("lowerEqualThan", Value::lowerEqualThan, "<=");
  public static final BinaryOperator LOWER_THAN = new BinaryOperator("lowherThan", Value::lowerThan, "<");
  public static final BinaryOperator MINUS = new BinaryOperator("minus", Value::minus, "-");
  public static final BinaryOperator MULTIPLY = new BinaryOperator("multiply", Value::multiply, "*");
  public static final UnaryOperator NEGATE = new UnaryOperator("negate", Value::negate, "-");
  public static final UnaryOperator NOT = new UnaryOperator("not", Value::not, "!");
  public static final BinaryOperator NOT_EQUALS = new BinaryOperator("notEquals", (left, right) -> left.equals(right).not(), "!=");
  public static final BinaryOperator OR = new BinaryOperator("or", Value::or, "||", "|");
  public static final BinaryOperator PLUS = new BinaryOperator("plus", Value::plus, "+");
  public static final BinaryOperator REMAINDER = new BinaryOperator("remainder", Value::remainder, "%");
  public static final BinaryOperator SHIFT_LEFT = new BinaryOperator("shiftLeft", Value::shiftLeft, "<<");
  public static final BinaryOperator SHIFT_RIGHT = new BinaryOperator("shiftRight", Value::shiftRight, ">>");
  public static final UnaryOperator TYPE_OF = new UnaryOperator("typeOf", value -> new TypeValue(value.getType()), "*");

  public static Operator forIdentifier(String identifier, boolean mustBeUnary) {
    for (Operator operator : values()) {
      if ((!mustBeUnary || operator instanceof UnaryOperator) && operator.getIdentifiers().contains(identifier)) {
        return operator;
      }
    }

    return null;
  }

  public static XView<Operator> values() {
    return Enumerations.values(OperatorList.class, Operator.class);
  }
}