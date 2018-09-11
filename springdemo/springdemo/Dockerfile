FROM java:8
LABEL maintainer=“bansodesachin0@gmail.com”
VOLUME /tmp
EXPOSE 8080
ADD target/Spring-Boot-Tomcat.war Spring-Boot-Tomcat.war
ENTRYPOINT ["java","-jar","Spring-Boot-Tomcat.war"]