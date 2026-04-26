#!/bin/bash

ROOT_DIR=$(pwd)
echo "Dang thuc thi Maven de build va chay Unit Test"

mvn -f "$ROOT_DIR/pom.xml" clean test