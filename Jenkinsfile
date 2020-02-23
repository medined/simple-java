pipeline {
  agent any
  stages {
    stage('Example') {
      steps {
        sh 'env | sort'
      }
    }
    stage('List Pods') {
      withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', namespace: 'sandvox', serverUrl: 'https://api.va-oit.cloud') {
          sh 'kubectl get pods'
      }
    }
  }
}
