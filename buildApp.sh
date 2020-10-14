#!bin/bash
rm -rf target/ #delete old generated files
mvn install package  #generate new jar files
java -jar target/Calculator-1.0-SNAPSHOT.jar &