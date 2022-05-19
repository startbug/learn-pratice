FROM openjdk:8-oracle

ENV version=Starbug_V1.0.0

ADD threadlocal-pratice/target/threadlocal-pratice-$version.jar /home/project/threadlocal-pratice-$version.jar

EXPOSE 8080

CMD ["java","-jar","/home/project/threadlocal-pratice-$version.jar"]
