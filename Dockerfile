FROM eclipse-temurin:17
RUN mkdir "/java"
ADD target/oauth2-authorization-server.jar /java/oauth2-authorization-server.jar
EXPOSE 9300
ARG JASYPT_ENCRYPTOR_PASSWORD=""
ENV PASSWORD=${JASYPT_ENCRYPTOR_PASSWORD}
ENTRYPOINT ["nohup", "java", "-jar", "/java/oauth2-authorization-server.jar", "--jasypt.encryptor.password=${PASSWORD}", "&"]
