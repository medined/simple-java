pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''
          whoami
          uname -a
          yum list | grep jdk
          echo $PATH
          env | sort
        '''
      }
    }
  }
}
