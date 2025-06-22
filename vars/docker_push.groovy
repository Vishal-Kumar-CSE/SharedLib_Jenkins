def call(String Project, String ImageTag){
  withCredentials([usernamePassword(credentialsId: 'DockerHubPat', passwordVariable: 'dockerhubpass', usernameVariable: 'dockerhubuser')]) {
    sh """
      echo "${dockerhubpass}" | docker login -u "${dockerhubuser}" --password-stdin
      docker push "${dockerhubuser}/${Project}:${ImageTag}"
    """
  }
}
