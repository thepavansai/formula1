FROM openjdk:21
EXPOSE 6969

COPY ./target/formula1-0.0.1-SNAPSHOT.jar formula1-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","formula1-0.0.1-SNAPSHOT.jar"]
