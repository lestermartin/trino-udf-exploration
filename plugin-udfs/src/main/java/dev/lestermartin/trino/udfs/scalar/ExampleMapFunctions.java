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
package dev.lestermartin.trino.udfs.scalar;

import io.airlift.slice.Slices;
import io.trino.spi.block.SqlMap;
import io.trino.spi.function.Description;
import io.trino.spi.function.ScalarFunction;
import io.trino.spi.function.SqlNullable;
import io.trino.spi.function.SqlType;
import io.trino.spi.function.TypeParameter;
import io.trino.spi.type.StandardTypes;

/**
 * STILL experimenting with accepting and returning MAP datatypes,
 *  BUT ONLY am able to receive them so far
 *
 * Been looking at the following bits of code and docs
 *  classes starting with 'Map' in https://github.com/trinodb/trino/tree/master/core/trino-main/src/main/java/io/trino/operator/scalar
 *  https://javadoc.io/doc/io.trino/trino-spi/latest/trino.spi/module-summary.html
 *  https://javadoc.io/doc/io.trino/trino-spi/latest/trino.spi/io/trino/spi/block/SqlMap.html
 *  https://javadoc.io/doc/io.trino/trino-spi/latest/trino.spi/io/trino/spi/type/StandardTypes.html
 */
public final class ExampleMapFunctions
{
    private ExampleMapFunctions() {}

    @TypeParameter("K")
    @TypeParameter("V")
    @SqlType(StandardTypes.BIGINT)
    @SqlNullable
    @Description("Returns a number representing the cardinality (the number of key-value pairs) of the map")
    @ScalarFunction("test_cardinality_as_number")
    public static Object determineCardinalityAsNumber(@SqlType("map(K,V)") SqlMap sqlMap)
    {
        return (long) sqlMap.getSize();
    }

    @TypeParameter("K")
    @TypeParameter("V")
    @SqlType(StandardTypes.VARCHAR)
    @SqlNullable
    @Description("Returns a string representing the cardinality (the number of key-value pairs) of the map")
    @ScalarFunction("test_cardinality_as_string")
    public static Object determineCardinalityAsString(@SqlType("map(K,V)") SqlMap sqlMap)
    {
        return Slices.utf8Slice(sqlMap.toString());
    }
}
