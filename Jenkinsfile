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
                echo "PATH = ${PATH}"
                echo "M2_HOME = ${M2_HOME}"
                echo "JAVA_HOME = ${JAVA_HOME}"
                ls -l "$JAVA_HOME\bin\java"
            ''' 
        }
    }
    stage('build') {
      steps {
        sh 'mvn --version'
      }
    }
  }
}
QuickOracle123$