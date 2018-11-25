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
    stage('Code Analysis') {
      steps {
        script {
          sh "${mvnCmd} sonar:sonar -Dsonar.host.url=http://sonarqube:9000 -DskipTests=true"
        }
      }
    }
    stage('Coverage') {
      steps {
        sh "${mvnCmd} verify"
      }
    }
    stage('Archive App') {
      steps {
        sh "${mvnCmd} deploy -DskipTests=true -P nexus"
      }
    }
  }
}
