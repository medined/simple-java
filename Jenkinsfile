pipeline {
  agent any
  tools { 
    maven 'Maven 3.5.4' 
    jdk 'jdk1.8.0_181' 
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
                ls -l $JAVA_HOME/bin/java
                java -version
                mvn --version
            ''' 
      }
    }
  }
}
