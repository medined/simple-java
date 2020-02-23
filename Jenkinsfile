pipeline {
  agent any
  stages {
    stage('List Pods') {
      withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', namespace: 'sandvox', serverUrl: 'https://api.va-oit.cloud') {
          sh 'kubectl get pods'
      }
    }
  }
}
