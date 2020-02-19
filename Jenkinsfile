pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        sh '''
          whoami
          uname -a
          apt-get update -y
          apt-cache poilicy
          sudo ls -l /etc/apt/sources.list
          echo $PATH
          env | sort
        '''
      }
    }
  }
}
