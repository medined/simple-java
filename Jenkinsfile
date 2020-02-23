node {
  stages {
    stage('Environment') {
      sh 'env | sort'
    }
    stage('Projet Directory') {
      sh 'ls -la $HUDSON_HOME/workspace/$$JOB_BASE_NAME@script'
    }
    stage('Introspection') {
      withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', contextName: 'va-oit.cloud', namespace: 'sandbox', serverUrl: 'https://api.va-oit.cloud') {
          sh '''
          CURRENT_CTX=$(kubectl config view --minify --output jsonpath="{.current-context}");
          NAMESPACE=$(kubectl config view --minify --output jsonpath="{.contexts[0].context.namespace}");
          echo "CURRENT_CTX: $CURRENT_CTX";
          echo "NAMESPACE: $NAMESPACE";
          '''
      }
    }
    stage('List Pods') {
      withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', contextName: 'va-oit.cloud', namespace: 'sandbox', serverUrl: 'https://api.va-oit.cloud') {
          sh '''
          kubectl get pods;
          '''
      }
    }
  }
}
