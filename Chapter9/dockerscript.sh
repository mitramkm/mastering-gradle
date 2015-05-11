#!/bin/sh

if [ "$1" == "" ]; then
	BUILD_HOME=./UserDetailsService
else
	BUILD_HOME=$1	
fi

docker pull tomcat:7.0.57-jre7

runningContainer=`docker ps -l | grep userdetailsservice | awk '{print $1}'`

if [ ! -z "$runningContainer" ] 
then
	docker stop $runningContainer
	docker rm $runningContainer
fi

docker run -d -p 8181:8080 --name "userdetailsservice" tomcat:7.0.57-jre7

containerid=`docker ps -l --no-trunc | grep userdetailsservice | awk '{print $1}'`

cp $BUILD_HOME/build/libs/userdetailsservice.war /var/lib/docker/aufs/mnt/$containerid/usr/local/tomcat/webapps

