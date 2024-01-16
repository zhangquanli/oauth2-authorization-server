FROM eclipse-temurin:11
RUN mkdir "/java"
COPY ./target/oauth2-authorization-server.jar /java
EXPOSE 9300
ARG JASYPT_ENCRYPTOR_PASSWORD=""
CMD ["java", "-jar", "/java/oauth2-authorization-server.jar", "--jasypt.encryptor.password=${JASYPT_ENCRYPTOR_PASSWORD}"]