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

package br.shura.venus.component.object;

import br.shura.venus.resultor.Resultor;
import br.shura.x.object.Base;

/**
 * Attribute.java
 *
 * @author <a href="https://www.github.com/BloodShura">BloodShura</a> (João Vitor Verona Biazibetti)
 * @contact joaaoverona@gmail.com
 * @date 29/05/16 - 01:33
 * @since GAMMA - 0x3
 */
public class Attribute extends Base {
  private final Resultor defaultResultor;
  private final String name;
  private final String type;

  public Attribute(String name, String type, Resultor defaultResultor) {
    this.defaultResultor = defaultResultor;
    this.name = name;
    this.type = type;
  }

  public Resultor getDefaultResultor() {
    return defaultResultor;
  }

  public String getName() {
    return name;
  }

  public String getType() {
    return type;
  }

  @Override
  protected Object[] stringValues() {
    return new Object[] { getName(), getType(), getDefaultResultor() };
  }
}