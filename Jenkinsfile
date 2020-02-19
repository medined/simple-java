pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''
          whoami
          uname -a
          apt update -y
          echo $PATH
          env | sort
        '''
      }
    }
  }
}
