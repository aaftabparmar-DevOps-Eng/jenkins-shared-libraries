def call() {
    dependencyCheck additionalArguments: '--format HTML --format XML', 
                   odcInstallation: 'dependency-check'
}
