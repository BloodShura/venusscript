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

package com.github.bloodshura.venus.component.branch;

import com.github.bloodshura.venus.component.Container;
import com.github.bloodshura.venus.expression.Expression;

/**
 * ForRangeContainer.java
 *
 * @author <a href="https://www.github.com/BloodShura">BloodShura</a> (João Vitor Verona Biazibetti)
 * @contact joaaoverona@gmail.com
 * @date 12/05/16 - 14:37
 * @since GAMMA - 0x3
 */
public class ForRangeContainer extends Container implements Breakable {
  private final Expression adjustment;
  private final Expression from;
  private final Expression to;
  private final String varName;

  public ForRangeContainer(String varName, Expression from, Expression to, Expression adjustment) {
    this.adjustment = adjustment;
    this.from = from;
    this.to = to;
    this.varName = varName;
  }

  public Expression getAdjustment() {
    return adjustment;
  }

  public Expression getFrom() {
    return from;
  }

  public Expression getTo() {
    return to;
  }

  public String getVarName() {
    return varName;
  }

  @Override
  public String toString() {
    return "for(" + getVarName() + " in [" + getFrom() + ", " + getTo() + "] with " + getAdjustment() + ')';
  }
}