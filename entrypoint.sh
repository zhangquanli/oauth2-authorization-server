#!/bin/bash
noup java -jar /java/oauth2-authorization-server.jar --jasypt.encryptor.password=$JASYPT_ENCRYPTOR_PASSWORD  &