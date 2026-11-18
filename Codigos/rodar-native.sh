#!/usr/bin/env bash
# Compila .kt para binário nativo e executa (sem JVM)
kotlinc-native native.kt -o native
./native.kexe
