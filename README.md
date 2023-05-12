
# About
This is a basic springboot starter project that leverages docker compose to quickly setup 3 running instances of a basic 
hello-world spring boot api, frontend by a ha-proxy load balancer running in roundrobbin mode. 

Springboot application instances are not exposed to the host machine or the outside world. They are listening on port 8080 within their 
respective docker containers. The ha-proxy load balancer is exposed to the host machine on port 80.

ha-proxy configuration is available in haproxy.cfg in the root of this directory. 

# Getting Started

**1. Build the application jar using gradle**

`./gradlew clean bootJar`

**2. Build the docker image for the spring boot application**
    
`docker build -t spring-boot-docker.`

**3. Start the docker containers using docker compose**

`docker-compose up -d`