pipeline {
  agent any
  tools { 
    maven 'Maven 3.5.4' 
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
                echo "Building"
                env | sort
                java -version
                mvn --version
            ''' 
      }
    }
  }
}
