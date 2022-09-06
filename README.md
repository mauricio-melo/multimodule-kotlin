# auth-microservice

bla bla bla

## Executando local

bla bla bla

*SPRING.PROFILES.ACTIVE=local*

## Rodar o flyway

* ./gradlew :auth-persistence:database_flyway -Purl='jdbc:mysql://localhost:3306/auth_dev?allowPublicKeyRetrieval=true&createDatabaseIfNotExist=true&useSSL=false&useTimezone=true&serverTimezone=UTC' -Puser=root -Ppassword=12345678 -Plocations='src/main/resources/flyway'