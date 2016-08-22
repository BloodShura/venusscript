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

package com.github.bloodshura.venus.library.dynamic;

import com.github.bloodshura.venus.component.Script;
import com.github.bloodshura.venus.exception.runtime.ScriptRuntimeException;
import com.github.bloodshura.venus.executor.Context;
import com.github.bloodshura.venus.function.FunctionCallDescriptor;
import com.github.bloodshura.venus.function.VoidMethod;
import com.github.bloodshura.venus.function.annotation.MethodArgs;
import com.github.bloodshura.venus.function.annotation.MethodName;
import com.github.bloodshura.venus.library.VenusLibrary;
import com.github.bloodshura.venus.value.StringValue;

import java.util.function.Supplier;

/**
 * DynamicUsing.java
 *
 * @author <a href="https://www.github.com/BloodShura">BloodShura</a> (João Vitor Verona Biazibetti)
 * @contact joaaoverona@gmail.com
 * @date 14/05/16 - 00:40
 * @since GAMMA - 0x3
 */
@MethodArgs(StringValue.class)
@MethodName("dynamicUsing")
public class DynamicUsing extends VoidMethod {
  @Override
  public void callVoid(Context context, FunctionCallDescriptor descriptor) throws ScriptRuntimeException {
    StringValue libraryName = (StringValue) descriptor.get(0);
    Script script = context.getScript();
    Supplier<VenusLibrary> supplier = script.getApplicationContext().getLibrarySuppliers().get(libraryName.value());
    VenusLibrary library;

    if (supplier != null && (library = supplier.get()) != null) {
      script.getLibraryList().add(library);
    }
    else {
      throw new ScriptRuntimeException(context, "Could not find a library named \"" + libraryName + "\"");
    }
  }
}