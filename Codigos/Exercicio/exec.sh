#!/usr/bin/env bash
kotlinc 01-cadastro-cliente.kt -include-runtime -d 01-cadastro-cliente.jar
java -jar 01-cadastro-cliente.jar