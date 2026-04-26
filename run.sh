#!/bin/bash
ROOT_DIR=$(pwd)
echo "Dang thuc thi Build, Test va Packaging"
mvn -f "$ROOT_DIR/pom.xml" clean package
echo "Build hoan tat! Kiem tra file .jar trong thu muc /target"