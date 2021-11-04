@echo off
call chcp 1251
call mvn clean install
java -jar .\target\maven.jar