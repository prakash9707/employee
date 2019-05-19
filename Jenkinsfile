
@Library('sharedlibrary@master') _


node{
def mvnHome
stage('git checkout process'){
  echo 'started checkout'
  git gitRepo()
  echo 'completed sucessfully'
}
  
  stage('SonarQube analysis') {
    withSonarQubeEnv('sonarqube') {
      mvnHome = '/opt/apache-maven/bin'
      sh "${mvnHome}/mvn sonar:sonar"
      
    }
  }

stage('Build') {
    echo 'hai over'
  }
}
  
  
