@Library('sharedlibrary@master') _

pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                HelloWorld 'testing'
            }
        }
    }
}
