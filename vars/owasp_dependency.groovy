def call() {

    sh '''
    dependency-check.sh \
    --project Wanderlust \
    --scan . \
    --format HTML \
    --out reports
    '''

}
