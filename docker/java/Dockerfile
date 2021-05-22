FROM adoptopenjdk/openjdk11:alpine

RUN apk add --no-cache \
    make \
    bash

# ホストマシン上のファイルをイメージ内にコピーする命令
ADD ./docker/wait-for-it.sh /usr/bin/wait-for-it.sh
RUN chmod +x /usr/bin/wait-for-it.sh
