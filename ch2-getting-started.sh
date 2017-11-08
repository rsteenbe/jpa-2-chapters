#!/bin/bash
echo '==================== Chapter 2 - Getting Started ===================='
APP_NAME=ch2-getting-started

cd /vagrant/$APP_NAME
mvn clean install
java -jar target/ch2-getting-started-1.0-jar-with-dependencies.jar