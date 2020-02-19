pipeline {
  agent any
  stages {
    stage('Build') {
      steps {
        whoami
        echo $PATH
        env | sort
      }
    }
  }
}
