#!/bin/sh
# Builds and runs the desktop version natively.
cd "$(dirname "$0")"
exec ./gradlew -q desktop:run
