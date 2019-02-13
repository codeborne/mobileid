FROM openjdk:8-alpine

COPY . /build
WORKDIR ./build
RUN ./gradlew check jar
