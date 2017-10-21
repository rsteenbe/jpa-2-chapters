#!/bin/bash
echo '====================> APM application installation started <===================='
APP_NAME=ch2-getting-started

apt install maven -y
cd /vagrant/$APP_NAME
mvn clean install
cd /vagrant/$APP_NAME/target/
cp $APP_NAME-1.0-SNAPSHOT.war /opt/wildfly/standalone/deployments/
cd /vagrant/$APP_NAME
mvn clean