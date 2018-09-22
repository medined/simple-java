# simple

simple web application

## Research

* Use the jenkinsci/blueocean image which has Blue Ocean pre-installed.

## Setup

* Run Jenkins as Docker container
* Create first admin user
* Install standard plugins
* Install Blue Ocean plugin.
* Start new pipeline.
* Get Github Access Token



## Jenkins

### start

```
docker run --name=jenkins --rm=true -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts
```

### get initial password

```
docker run --name=jenkins --rm=true -p 8080:8080 -p 50000:50000 -v jenkins_home:/var/jenkins_home jenkins/jenkins:lts
```

