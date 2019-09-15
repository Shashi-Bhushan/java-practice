#!/bin/sh
mvn clean package && docker build -t in.shabhushan.practice/java-practice .
docker rm -f java-practice || true && docker run -d -p 8080:8080 -p 4848:4848 --name java-practice in.shabhushan.practice/java-practice 
