pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''
          whoami
          echo $PATH
          env | sort
        '''
      }
    }
  }
}
