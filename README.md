# Spring Redis Cache Demo

A simple Spring Boot application demonstrating how to use **Spring Cache** with **Redis**.

## Features

- Spring Boot 3
- Spring Cache
- Redis as the cache provider
- `@Cacheable`
- `@CachePut`
- `@CacheEvict`
- RESTful APIs
- Docker-based Redis

---

## Technology Stack

- Java 17+
- Spring Boot
- Spring Cache
- Redis
- Maven
- Docker

---

## Project Structure

```
src
├── controller
│   └── ProductController.java
├── service
│   └── ProductService.java
├── config
│   └── RedisCacheConfig.java
├── model
│   └── Product.java
└── DemoApplication.java
```

---

# Getting Started

## Prerequisites

- Java 17+
- Maven
- Docker Desktop

---

## 1. Start Redis

```bash
docker run -d --name redis-cache -p 6379:6379 redis:latest
```

Example output

```text
Unable to find image 'redis:latest' locally
latest: Pulling from library/redis
...
Status: Downloaded newer image for redis:latest
```

---

## 2. Verify Redis

```bash
docker exec -it redis-cache redis-cli ping
```

Output

```text
PONG
```

---

## 3. Clear Redis Cache

```bash
docker exec -it redis-cache redis-cli FLUSHALL
```

Output

```text
OK
```

---

## 4. Run the Spring Boot Application

```bash
mvn spring-boot:run
```

or

```bash
./mvnw spring-boot:run
```

The application starts on

```
http://localhost:8080
```

---

# REST API Examples

## Get Product

```bash
curl http://localhost:8080/products/1
```

Response

```json
{
  "id": 1,
  "name": "Product-1",
  "price": 99.99
}
```

---

## Update Product

```bash
curl -X PUT http://localhost:8080/products \
-H "Content-Type: application/json" \
-d "{\"id\":1,\"name\":\"Updated\",\"price\":149.99}"
```

Response

```json
{
  "id": 1,
  "name": "Updated",
  "price": 149.99
}
```

---

## Get Product Again

```bash
curl http://localhost:8080/products/1
```

Response

```json
{
  "id": 1,
  "name": "Updated",
  "price": 149.99
}
```

This demonstrates that the Redis cache has been updated.

---

# Cache Flow

```
Client
   │
   ▼
ProductController
   │
   ▼
ProductService
   │
   ├── Cache Hit
   │      │
   │      ▼
   │   Redis
   │
   └── Cache Miss
          │
          ▼
   Business Logic
          │
          ▼
      Save to Redis
          │
          ▼
       Return Result
```

---

# Cache Annotations

| Annotation | Purpose |
|------------|---------|
| `@Cacheable` | Read from cache before executing the method |
| `@CachePut` | Execute the method and update the cache |
| `@CacheEvict` | Remove data from the cache |

---

# Git Commands Used

```bash
git init
git remote add origin https://github.com/carrieyanzh/SpringRedis.git

git add .

git commit -m "Initial Spring Redis demo"

git branch -M main

git pull origin main --allow-unrelated-histories

git push -u origin main
```

---

# Author

Carrie Zhuang
