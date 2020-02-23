pipeline {
  agent any
  stages {
    stage('Environment') {
      steps {
        sh 'env | sort'
      }
    }
    stage('Project Directory') {
      steps {
        sh 'find $WORKSPACE'
      }
    }
    stage('Deploy to ephemeral namespace.') {
      steps {
        withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', contextName: 'va-oit.cloud', namespace: 'sandbox', serverUrl: 'https://api.va-oit.cloud') {
          sh '''
          NAMESPACE="ephermeral-$JOB_NAME"
          # create namespace if needed.
          kubectl get namespace $NAMESPACE || kubectl create namespace $NAMESPACE;
          # change current namespace.
          kubectl config set-context --current --namespace=$NAMESPACE
          kubectl get pods;
          kubectl delete namespace $NAMESPACE
          '''
        }
      }
    }
  }
}
