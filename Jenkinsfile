pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''
          whoami
          uname -a
          lsb_release -a
          cat /etc/*release
          cat /etc/issue*
          cat /proc/vesion
          echo $PATH
          env | sort
        '''
      }
    }
  }
}
