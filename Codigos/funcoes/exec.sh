#!/usr/bin/env bash
# Uso: ./exec.sh 01-basico.kt
cd "$(dirname "$0")"
ARQUIVO="${1:-01-basico.kt}"
BASE="$(basename "${ARQUIVO%.kt}")"
kotlinc "$ARQUIVO" -include-runtime -d "$BASE.jar"
java -jar "$BASE.jar"
