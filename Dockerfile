
# Dockerfile for all mvn dependencies

FROM maven:3.5-jdk-8

COPY ./ ./

RUN mvn package -DskipTests

CMD ["java", "-jar", "./target/flaconi-test-automation-engineer-challenge.jar"]

ENTRYPOINT ["java", "-jar", "./target/flaconi-test-automation-engineer-challenge.jar"]