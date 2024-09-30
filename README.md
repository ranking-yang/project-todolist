# To-Do List
springboot + react 로 구성해본 to-do list 입니다.

## 실행 방법

### 방법 1. Docker-compose 실행
#### Required
- Docker
- Docker-compose
- JDK 17
#### Steps
1. git clone
    ```
    git clone https://github.com/ranking-yang/project-todolist.git
    ```
2. backend gradle 빌드
    ```
    cd backend

    chmod +x gradlew
    ./gradlew
    ```
3. docker-compose 실행
    ```
    cd ..
    docker-compose up -d
    ```

### 방법 2. Docker 실행
#### Required
- Docker
- JDK 17
#### Steps
1. git clone
    ```
    git clone https://github.com/ranking-yang/project-todolist.git
    ```
2. create docker network
    ```
    git network create todolist
    ```
3. backend 실행
    ```
    cd backend
    ./gradlew bootjar
    docker build -t backend .
    docker run -it --network todolist -d --name backend -p 8080:8080 backend
    ```
4. frontend 실행
    ```
    cd ../frontend
    docker build -t frontend .
    docker run -it --network todolist -d --name frontend -p 80:80 frontend
    ```

### 방법3. 개별 실행
#### Required
- Docker
- JDK 17
#### Steps
각 디렉토리의 설명을 따라합니다.
- [backend](https://github.com/ranking-yang/project-todolist/tree/main/backend)
- [frontend](https://github.com/ranking-yang/project-todolist/tree/main/frontend)