FROM openjdk:11-jre
ENTRYPOINT ["java", "-jar", "/usr/share/ms.jar"]

ARG JAR_FILE
ADD target/${JAR_FILE} /usr/share/ms.jar