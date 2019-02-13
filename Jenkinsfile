pipeline {
  agent any

  environment {
    REPO_NAME = "${env.JOB_NAME.split('/')[1]}"
  }

  stages {
    stage('Build') {
      steps {
        sh 'docker build -t $REPO_NAME .'
      }
    }
    stage('Publish') {
      steps {
        sh 'mkdir -p /var/www/repo/com/codeborne/mobileid/'
        sh 'docker run -v /var/www/repo:/var/www/repo $REPO_NAME cp /build/build/libs/mobileid*.jar /var/www/repo/com/codeborne/mobileid/'
      }
    }
  }
}
