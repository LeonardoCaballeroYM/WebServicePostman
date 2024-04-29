FROM openjdk:17

EXPOSE 8080

ADD ./target/WebServicePostman-0.0.1-SNAPSHOT.jar webservice.jar

ENTRYPOINT ["java","-jar","/webservice.jar"]