/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package dev.lestermartin.trino.udfs;

import com.google.common.collect.ImmutableSet;
import dev.lestermartin.trino.udfs.scalar.ExampleMapFunctions;
import dev.lestermartin.trino.udfs.scalar.ExampleNullFunction;
import dev.lestermartin.trino.udfs.scalar.ExampleStringFunction;
import io.trino.spi.Plugin;

public class LesterTesterFunctionsPlugin
        implements Plugin
{
    @Override
    public java.util.Set<Class<?>> getFunctions()
    {
        return ImmutableSet.<Class<?>>builder()
                .add(ExampleNullFunction.class)
                .add(ExampleStringFunction.class)
                .add(ExampleMapFunctions.class)
                .build();
    }
}
