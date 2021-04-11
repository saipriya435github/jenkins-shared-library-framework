def call() {  
  
     environment {
        scannerHome = tool 'sonarqube'
    }
    steps {
        withSonarQubeEnv('sonarqube') {
            sh "${scannerHome}/bin/sonar-scanner -Dsonar.projectKey=HelloWorldServlet-Pipeline -Dsonar.projectName=HelloWorldServlet-Pipeline -Dsonar.java.binaries=/var/lib/jenkins/workspace/sample-pipeline/target/classes -Dsonar.projectKey=HelloWorldServlet-Pipeline -Dsonar.sources=/var/lib/jenkins/workspace/sample-pipeline"
        }
	}
}
