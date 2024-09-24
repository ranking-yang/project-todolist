# 개발 환경
- JDK 17
- Springboot
- JPA
- H2 DB


# 실행방법

```
git clone https://github.com/ranking-yang/project-todolist.git
cd project-todolist/backend
./gradlew bootRun
```

## DB 접속
```
http://localhost:8080/h2-console
```
```
jdbc:h2:./h2/data
```


# API 정보

## 할일 생성
### Method
`GET`
### URL
/api/post
### Request Body
| key  | type	 |
|------|---------|
| id   | number  |
| text | string  |
| done | boolean |


## 할일 수정
### Method
`PUT`
### URL
/api/put/{id}
### Request Body
| key  | type	 |
|------|---------|
| id   | number  |
| text | string  |
| done | boolean |


## 할일 목록 출력
### Method
`GET`
### URL
/api/get

## 할일 삭제
### Method
`DELETE`
### URL
/api/delete/{id}