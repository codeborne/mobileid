pipeline {
  agent any

  environment {
    REPO_NAME = "${env.JOB_NAME.split('/')[1]}"
    DEST = "/var/www/repo/com/codeborne/mobileid"
  }

  stages {
    stage('Build') {
      steps {
        sh 'docker build -t $REPO_NAME .'
      }
    }
    stage('Publish') {
      steps {
        sh 'mkdir -p $DEST'
        sh 'docker run -v /var/www/repo:/var/www/repo $REPO_NAME sh -c "cp build/libs/mobileid*.jar $DEST"'
      }
    }
  }
}
