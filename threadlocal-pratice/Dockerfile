FROM openjdk:8-oracle

ENV version=${maven.project.version}

ADD threadlocal-pratice-$version /home/project/threadlocal-pratice-$version

EXPOSE 8080

CMD ["java","-jar","/home/project/threadlocal-pratice-$version"]
