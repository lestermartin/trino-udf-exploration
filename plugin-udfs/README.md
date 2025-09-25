# trino-udf-exploration
**Trino UDF (SPI functions) exploration.**

This is a learning & experimental repository. It builds a Trino plugin that surfaces a number of functions that can be used in SQL statements.

## Build
Build was run with the following environment.
- Apple M2 Pro chip w/OS 15.6.1
- Maven 3.9.11
- OpenJDK 24.0.2

First, clone this repository, cd into this folder (i.e. `plugin-udfs`), and run the following command.

`mvn package -Dmaven.test.skip=true`

This will produce a `trino-udf-exploration-<version>.zip` under the `target/` directory.

This has been built successfully with Trino 466 dependencies and deploy on a Trino 476 instance.

## Installation
Unzip `trino-udf-exploration-<version>.zip` into the plugins directory of your Trino cluster and restart.
