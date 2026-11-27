#!/usr/bin/env bash
# Uso: ./exec.sh          → roda poo01.kt
#      ./exec.sh outro.kt
cd "$(dirname "$0")"
ARQUIVO="${1:-poo01.kt}"
BASE="$(basename "${ARQUIVO%.kt}")"
kotlinc "$ARQUIVO" -include-runtime -d "$BASE.jar"
java -jar "$BASE.jar"
