
@Library('sharedlibrary@master') _


node{
def mvnHome
def getInformation = parameter()
stage('git checkout process'){
  echo 'started checkout'
  echo getInformation.gitRepo
  echo getInformation.dockerimg
  echo getInformation.server
  git getInformation.gitRepo
  echo 'completed sucessfully'
}
  
  stage('SonarQube analysis') {
    withSonarQubeEnv('sonarqube') {
      mvnHome = '/opt/apache-maven/bin'
      sh "${mvnHome}/mvn sonar:sonar"
      
    }
  }
  
  stage("Quality Gate"){
  timeout(time: 1, unit: 'HOURS') { // Just in case something goes wrong, pipeline will be killed after a timeout
    def qg = waitForQualityGate() // Reuse taskId previously collected by withSonarQubeEnv
    if (qg.status != 'OK') {
      error "Pipeline aborted due to quality gate failure: ${qg.status}"
    }
  }
}

stage('Build') {
    echo 'hai over'
  }
}
  
  
