FROM alpine:3.17

RUN  apk update \
  && apk upgrade --no-cache \
  && apk add --no-cache openjdk17 tzdata \
  && rm -rf /var/cache/apk/*

ENV TZ=Asia/Seoul

RUN apk --no-cache add tzdata \
  && cp /usr/share/zoneinfo/${TZ} /etc/localtime \
  && apk del tzdata

WORKDIR /app

COPY build/libs/backend-0.0.1-SNAPSHOT.jar .

CMD ["java", "-jar", "backend-0.0.1-SNAPSHOT.jar"]

EXPOSE 8080
