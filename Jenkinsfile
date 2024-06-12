@Library('jenkins-shared-libs') _
pipeline {
    agent any

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
