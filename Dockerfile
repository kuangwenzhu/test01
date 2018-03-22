FROM 192.168.0.83:20202/hwcse/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/kwz001-0.0.1-SNAPSHOT.jar .
ADD target/lib ./lib
ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
