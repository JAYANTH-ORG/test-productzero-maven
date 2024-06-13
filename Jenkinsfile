@Library('jenkins-shared-libs') _
pipeline {
    agent any
    parameters {
        choice(name: 'Operation', choices: ['build', 'test', 'deploy'], description: 'Choose an option')
    }
    stages {
        stage('Initialization') {
            steps {
                deleteDir()
                checkout scm
                echo "checking out the repo"
            }
        }
         stage('Maven Build') {
            steps {
                MvnBuild()
            }
        }
       
    }
}
