# simple

simple web application

## Research

* Use the jenkinsci/blueocean image which has Blue Ocean pre-installed.

## Setup

* Run Jenkins as Docker container
* Create first admin user
* Install standard plugins
* Get Github Access Token
* Setup Maven in Global Tool Configuration

## Jenkins

### start

```
docker run \
  --rm \
  --name=jenkins \
  -u root \
  -p 8080:8080 \
  -p 50000:50000 \
  -v jenkins-data:/var/jenkins_home \
  -v $(which docker):/usr/bin/docker \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$HOME":/home jenkinsci/blueocean
```

### get initial password

```
docker exec jenkins 
```

