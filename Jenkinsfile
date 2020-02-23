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
        sh 'find /home/jenkins'
      }
    }
    stage('Introspection') {
      steps {
        withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', contextName: 'va-oit.cloud', namespace: 'sandbox', serverUrl: 'https://api.va-oit.cloud') {
            sh '''
            CURRENT_CTX=$(kubectl config view --minify --output jsonpath="{.current-context}");
            NAMESPACE=$(kubectl config view --minify --output jsonpath="{.contexts[0].context.namespace}");
            echo "CURRENT_CTX: $CURRENT_CTX";
            echo "NAMESPACE: $NAMESPACE";
            '''
        }
      }
    }
    stage('Create ephemeral namespace if needed') {
      steps {
        withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', contextName: 'va-oit.cloud', namespace: 'sandbox', serverUrl: 'https://api.va-oit.cloud') {
          sh "kubectl get namespace ephemeral || kubectl create namespace ephemeral;"
        }
      }
    }
    stage('List Pods') {
      steps {
        withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', contextName: 'va-oit.cloud', namespace: 'sandbox', serverUrl: 'https://api.va-oit.cloud') {
            sh '''
            kubectl get namespaces;
            kubectl get pods;
            '''
        }
      }
    }
    stage('Delete ephemeral namespace') {
      steps {
        withKubeConfig(clusterName: 'ic1', credentialsId: 'jenkins-deployer-credentials', contextName: 'va-oit.cloud', namespace: 'sandbox', serverUrl: 'https://api.va-oit.cloud') {
          sh "kubectl delete namespace ephemeral"
        }
      }
    }
  }
}
