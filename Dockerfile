FROM openjdk:17

LABEL mentainer="adityamathur97@gmail.com"

ENV MYSQL_ROOT_PASSWORD=pass

RUN mkdir /home/rhapsody

COPY ./target/rhapsody-0.0.1-SNAPSHOT.jar /home/rhapsody


EXPOSE 8080

WORKDIR /home/rhapsody

CMD ["java", "-jar", "rhapsody-0.0.1-SNAPSHOT.jar"]
