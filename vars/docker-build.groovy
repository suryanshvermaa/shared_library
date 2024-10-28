def call(String projectName,String imageTag,String dockerHubUser){
  echo "building image"
  sh "docker build -t ${dockerHubUser}/${projectName}:${imageTag} ."
  echo "image build successful"
}
