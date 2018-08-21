FROM 192.168.3.88:20202/default/dockerhub-java:8-jre-alpine

WORKDIR /home/apps/
ADD target/dsdsdswwdw-0.0.1-SNAPSHOT.jar .

ADD start.sh .

ENTRYPOINT ["sh", "/home/apps/start.sh"]
