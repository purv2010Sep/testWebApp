#!/bin/bash
set -euox # https://explainshell.com/explain?cmd=set+-euox

docker-compose -f docker-compose.yml run --rm  gatling
