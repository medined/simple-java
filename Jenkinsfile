pipeline {
  agent {
    label 'maven'
  }
  stages {
    stage ('Initialize') {
        steps {
            sh '''
                echo "Initializing"
            '''
        }
    }
    stage('build') {
      steps {
            sh '''
                java -version
                pwd
                mvn package
            '''
      }
    }
  }
}
