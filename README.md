# Spring Redis

## Prerequisites

- Docker Desktop installed
- Docker service is running

## Start Redis Container

Run the following command:

```bash
docker run -d --name redis-cache -p 6379:6379 redis:latest
```

Example output:

```text
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
```

## Verify Redis

Check that Redis is running:

```bash
docker exec -it redis-cache redis-cli ping
```

Output:

```text
PONG
```

## Clear Redis Cache

Remove all keys from Redis:

```bash
docker exec -it redis-cache redis-cli FLUSHALL
```

Output:

```text
OK
```

curl http://localhost:8080/products/1
{"id":1,"name":"Product-1","price":99.99}

curl -X PUT http://localhost:8080/products -H "Content-Type: application/json" -d "{\"id\":1,\"name\":\"Updated\",\"price\":149.99}"
{"id":1,"name":"Updated","price":149.99}

curl http://localhost:8080/products/1
{"id":1,"name":"Updated","price":149.99}



PS C:\2512Mycodes\cachedemo\demo> git status
fatal: not a git repository (or any of the parent directories): .git
PS C:\2512Mycodes\cachedemo\demo> git init
Initialized empty Git repository in C:/2512Mycodes/cachedemo/demo/.git/
PS C:\2512Mycodes\cachedemo\demo> git remote -v
PS C:\2512Mycodes\cachedemo\demo> git remote add origin https://github.com/carrieyanzh/SpringRedis.git
PS C:\2512Mycodes\cachedemo\demo> git remote -v
origin  https://github.com/carrieyanzh/SpringRedis.git (fetch)
origin  https://github.com/carrieyanzh/SpringRedis.git (push)
PS C:\2512Mycodes\cachedemo\demo> git add .
warning: in the working copy of '.gitattributes', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.gitignore', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of '.mvn/wrapper/maven-wrapper.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'mvnw.cmd', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'pom.xml', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/java/com/example/demo/DemoApplication.java', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/main/resources/application.properties', LF will be replaced by CRLF the next time Git touches it
warning: in the working copy of 'src/test/java/com/example/demo/DemoApplicationTests.java', LF will be replaced by CRLF the next time Git touches it
PS C:\2512Mycodes\cachedemo\demo> git commit -m "Initial Spring Redis demo"
[master (root-commit) 1d6311b] Initial Spring Redis demo
 13 files changed, 770 insertions(+)
 create mode 100644 .gitattributes
 create mode 100644 .gitignore
 create mode 100644 .mvn/wrapper/maven-wrapper.properties
 create mode 100644 mvnw
 create mode 100644 mvnw.cmd
 create mode 100644 pom.xml
 create mode 100644 src/main/java/com/example/demo/DemoApplication.java
 create mode 100644 src/main/java/com/example/demo/Product.java
 create mode 100644 src/main/java/com/example/demo/ProductController.java
 create mode 100644 src/main/java/com/example/demo/ProductService.java
 create mode 100644 src/main/java/com/example/demo/RedisCacheConfig.java
 create mode 100644 src/main/resources/application.properties
 create mode 100644 src/test/java/com/example/demo/DemoApplicationTests.java
PS C:\2512Mycodes\cachedemo\demo> git branch -M main
PS C:\2512Mycodes\cachedemo\demo> git push -u origin main
To https://github.com/carrieyanzh/SpringRedis.git
 ! [rejected]        main -> main (fetch first)
error: failed to push some refs to 'https://github.com/carrieyanzh/SpringRedis.git'
hint: Updates were rejected because the remote contains work that you do not
hint: have locally. This is usually caused by another repository pushing to
hint: the same ref. If you want to integrate the remote changes, use
hint: 'git pull' before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
PS C:\2512Mycodes\cachedemo\demo> git pull origin main --allow-unrelated-histories
remote: Enumerating objects: 6, done.
remote: Counting objects: 100% (6/6), done.
remote: Compressing objects: 100% (3/3), done.
remote: Total 6 (delta 0), reused 0 (delta 0), pack-reused 0 (from 0)
Unpacking objects: 100% (6/6), 2.12 KiB | 103.00 KiB/s, done.
From https://github.com/carrieyanzh/SpringRedis
 * branch            main       -> FETCH_HEAD
 * [new branch]      main       -> origin/main
Merge made by the 'ort' strategy.
 README.md | 20 ++++++++++++++++++++
 1 file changed, 20 insertions(+)
 create mode 100644 README.md
PS C:\2512Mycodes\cachedemo\demo> git add .
PS C:\2512Mycodes\cachedemo\demo> git commit -m "Merge remote repository"
On branch main
nothing to commit, working tree clean
PS C:\2512Mycodes\cachedemo\demo> git push origin main
Enumerating objects: 32, done.
Counting objects: 100% (32/32), done.
Delta compression using up to 8 threads
Compressing objects: 100% (22/22), done.
Writing objects: 100% (31/31), 11.49 KiB | 1.28 MiB/s, done.
Total 31 (delta 1), reused 0 (delta 0), pack-reused 0 (from 0)
remote: Resolving deltas: 100% (1/1), done.
To https://github.com/carrieyanzh/SpringRedis.git
   1a9f065..7b215e7  main -> main
PS C:\2512Mycodes\cachedemo\demo>
