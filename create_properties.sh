#!/usr/bin/env bash

#./create_properties.sh > ./src/main/resources/application.properties

echo "spring.datasource.url=${db_url}
spring.datasource.username=${db_user}
spring.datasource.password=${db_pass}
spring.jpa.hibernate.ddl-auto=create
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
spring.jpa.properties.hibernate.format_sql=true
server.error.include-message=always

# App Properties
tarintrading.app.jwtSecret=${jwt_secret}
tarintrading.app.jwtExpirationMs=86400000
" > ./src/main/resources/application.properties