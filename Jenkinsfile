def mvnCmd = "mvn"

pipeline {
  agent {
    label 'maven'
  }
  stages {
    stage('Build App') {
      steps {
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
    stage('Build Image') {
      steps {
        sh "cp target/simple-0.0.1-SNAPSHOT.war target/ROOT.war"
        script {
          openshift.withCluster() {
            openshift.withProject("zz-slp-dev-02-o1") {
              openshift.selector("bc", "simple").startBuild("--from-file=target/ROOT.war", "--wait=true")
            }
          }
        }
      }
    }
  }
}
