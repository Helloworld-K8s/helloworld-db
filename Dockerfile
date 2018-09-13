FROM openjdk:10-jdk

MAINTAINER mehdi.elkouhen@softeam.fr

WORKDIR /apps/helloworld-db

COPY build/libs/helloworld-db.jar /apps/helloworld-db/helloworld-db.jar

EXPOSE 8080

CMD java -jar helloworld-db.jar