#!/bin/bash
set -o errexit
set -o nounset

git submodule update --init --recursive

echo ----- in $(pwd)
./gradlew --version
for I in base-server markdown_editor
do
    (cd "$I" && echo ----- in $(pwd) && ./gradlew --version)
done

./gradlew test