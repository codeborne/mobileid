pipeline {
  agent any

  environment {
    REPO_NAME = "${env.JOB_NAME.split('/')[1]}"
  }

  stages {
    stage('Build') {
      steps {
        sh 'docker -t $REPO_NAME .'
      }
    }
  }
}
