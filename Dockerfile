FROM openjdk:17

COPY ./build/libs/account-0.0.1-SNAPSHOT.jar /var/tmp/account.jar
# WORKDIR /var/tmp/
RUN chmod +x /var/tmp/account.jar
EXPOSE 8080

ENTRYPOINT ["java","-jar","/var/tmp/account.jar"]

