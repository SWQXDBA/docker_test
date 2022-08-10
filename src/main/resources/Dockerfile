FROM openjdk:11
WORKDIR /home
WORKDIR app
COPY ./*.jar ./app.jar
EXPOSE 8080
RUN echo 准备启动了!!!
RUN echo pwd
RUN pwd
ENTRYPOINT ["java","-jar","app.jar"]
