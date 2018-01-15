#!/usr/bin/env bash
docker rm -f guest-db
docker build -t guest-postgres .
docker run  -idt --name guest-db -e POSTGRES_PASSWORD=root -m 256m -v /user/local/volume/:/var/lib/postgresql/data:rw -p 5432:5432 -d guest-postgres