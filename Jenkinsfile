pipeline {
    agent any
    stages {
        stage('clone') {
            steps {
                git(url: 'https://github.com/medined/simple.git', branch: 'master')
            }
        }
        stage('Build') { 
            steps { 
                echo 'This is a minimal pipeline.' 
            }
        }
    }
  }
}