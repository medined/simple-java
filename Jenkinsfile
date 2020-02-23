node {
  stage('List Pods') {
    withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', namespace: 'sandbox', serverUrl: 'https://api.va-oit.cloud') {
        sh 'kubectl get pods'
    }
  }
}
