#!/bin/sh

EXEC_FILE=$(ls -t it.lispa-jar* | head -n 1)

nohup java -jar "$EXEC_FILE" &
