node {
  stage('List Pods') {
    withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', namespace: 'ephemeral', serverUrl: 'https://api.va-oit.cloud') {
        sh 'kubectl get namespaces'
        sh 'kubectl get pods'
    }
  }
}
