# SpringRedis
commands:
docker run -d --name redis-cache -p 6379:6379 redis:latest
Unable to find image 'redis:latest' locally
latest: Pulling from library/redis
3b3d036990fd: Pull complete
b682f1c4b938: Pull complete
4f4fb700ef54: Pull complete
12cf9316ae87: Pull complete
5096a4b992f4: Pull complete
e95a6c7ea7d4: Pull complete
f6e607ad0f52: Pull complete
Digest: sha256:2838d5524559494f6f1cd66e97e76b200d64a633a8614200620755ed395daf32
Status: Downloaded newer image for redis:latest
f8f8768030c3d1d6812fe6a2eac767762646dbcfa1871912ae65a1193b957de0

docker exec -it redis-cache redis-cli ping
PONG
docker exec -it redis-cache redis-cli FLUSHALL
OK
