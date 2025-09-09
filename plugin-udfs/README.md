# starburst-hive-udfs
UDFs for compatibility with HiveQL

Hive contains a number of built in functions that don't exist in other SQL engines, including Trino. This repository will build a Trino plugin that adds many of these. Read more details on this project by the [link](https://starburstdata.atlassian.net/wiki/spaces/STARBURST/pages/2441117699/How+to+build+and+deploy+Starburst+UDF+package).

## Build
1. Clone this repository.
2. Run mvn install (maven must be installed on your machine)
3. This has been tested with maven version 3.8.5. Was initialy testing this using maven version 3.9.3 and it didn't work.
4. This will produce a `starburst-hive-udfs-<version>.zip` under the `target/` directory.
5. This is tested and build created sucessfully for SEP 402, 407, 413, 423, 429, 435, 443 and 453 using mvn clean package.

## Installation
Unzip `starburst-hive-udfs-<version>.zip` into the plugins directory of your Trino cluster and restart.
