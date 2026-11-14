#!/usr/bin/env bash
# Compila .kt para binário nativo e executa (sem JVM; macOS precisa do Xcode)

kotlinc-native native.kt -o native
./native.kexe
