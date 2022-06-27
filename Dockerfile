FROM openjdk
EXPOSE 8080
ADD /target/Comments.jar /Comments.jar
ENTRYPOINT ["java","-jar","Comments.jar"]
