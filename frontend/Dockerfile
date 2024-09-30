FROM node:20 AS build

WORKDIR /app

COPY . /app

RUN npm install
RUN npm run build


FROM nginx:alpine

RUN rm /etc/nginx/conf.d/default.conf
COPY ./nginx/nginx.conf /etc/nginx/conf.d/nginx.conf

COPY --from=build /app/build /usr/share/nginx/html

EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
