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

package br.shura.venus.component.branch;

import br.shura.venus.component.Container;
import br.shura.venus.expression.Expression;

/**
 * ForEachContainer.java
 *
 * @author <a href="https://www.github.com/BloodShura">BloodShura</a> (João Vitor Verona Biazibetti)
 * @contact joaaoverona@gmail.com
 * @date 22/05/16 - 03:40
 * @since GAMMA - 0x3
 */
public class ForEachContainer extends Container implements Breakable {
  private final Expression iterable;
  private final String varName;

  public ForEachContainer(String varName, Expression iterable) {
    this.iterable = iterable;
    this.varName = varName;
  }

  public Expression getIterable() {
    return iterable;
  }

  public String getVarName() {
    return varName;
  }

  @Override
  public String toString() {
    return "foreach(" + getVarName() + " in " + getIterable() + ')';
  }
}