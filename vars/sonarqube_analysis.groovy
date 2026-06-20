def call(String sonarTool, String projectKey, String projectName) {
    withSonarQubeEnv("${sonarTool}") {
        sh """
            sonar-scanner \
            -Dsonar.projectKey=${projectKey} \
            -Dsonar.projectName=${projectName} \
            -Dsonar.sources=. \
            -Dsonar.exclusions=**/node_modules/**,**/Automations/** \
            -Dsonar.java.binaries=.
        """
    }
}
