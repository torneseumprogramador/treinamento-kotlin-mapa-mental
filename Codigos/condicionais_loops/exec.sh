#!/usr/bin/env bash
# Uso:
#   ./exec.sh tests.kt
#   ./exec.sh 01-cinema-ingresso/01-cinema-ingresso.kt
cd "$(dirname "$0")"
ARQUIVO="${1:-tests.kt}"
BASE="$(basename "${ARQUIVO%.kt}")"
kotlinc "$ARQUIVO" -include-runtime -d "$BASE.jar"
java -jar "$BASE.jar"
