FROM openjdk:11
ADD cloudantspr.jar cloudantspr.jar
EXPOSE 9090
ENTRYPOINT ["java","-jar","cloudantspr.jar"]
