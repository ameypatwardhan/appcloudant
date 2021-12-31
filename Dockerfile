FROM openjdk:11
ADD target/cloudantspr.jar cloudantspr.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","cloudantspr.jar"]