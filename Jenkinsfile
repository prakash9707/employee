
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
    def qg = waitForQualityGate()
      if (qg.status == 'Error') {
          error "Pipeline aborted due to quality gate failure: ${qg.status}"
      }
  }

stage('Build') {
    echo 'hai over'
  }
}
  
  
