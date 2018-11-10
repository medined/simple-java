pipeline {
  agent {
    label 'maven'
  }
  stages {
    stage ('Initialize') {
        steps {
            sh '''
                echo "Initializing the pipeline"
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
