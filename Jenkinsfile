def mvnCmd = "mvn"

pipeline {
  agent {
    label 'maven'
  }
  stages {
    stage('Build App') {
      steps {
        script {
          def pom = readMavenPom file: 'pom.xml'
          version = pom.version
        }
        sh "${mvnCmd} install -DskipTests=true"
      }
    }
    stage('Test') {
      steps {
        sh "${mvnCmd} test"
        step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
      }
    }
    stage('Coverage') {
      steps {
        sh "${mvnCmd} verify"
      }
    }
    stage('Create DEV') {
      when {
        expression {
          openshift.withCluster() {
            openshift.withProject('simple-dev') {
              return !openshift.selector('dc', 'tasks').exists()
            }
          }
        }
      }
      steps {
        script {
          openshift.withCluster() {
            openshift.withProject('simple-dev') {
              def app = openshift.newApp("tasks:latest")
              app.narrow("svc").expose();

              def dc = openshift.selector("dc", "tasks")
              while (dc.object().spec.replicas != dc.object().status.availableReplicas) {
                  sleep 10
              }
              openshift.set("triggers", "dc/tasks", "--manual")
            }
          }
        }
      }
    }
  }
}
