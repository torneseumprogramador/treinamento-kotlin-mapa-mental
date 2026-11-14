#!/usr/bin/env bash
# Compila .kt para JAR e executa (precisa da JVM)

kotlinc normal.kt -include-runtime -d normal.jar
java -jar normal.jar "$@"
