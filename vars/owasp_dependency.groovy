def call() {

    dependencyCheck(
        odcInstallation: 'dependency-check',
        additionalArguments: '''
            --project Wanderlust
            --scan .
            --format HTML
            --out reports
        '''
    )

}
