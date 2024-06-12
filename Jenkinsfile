@Library('jenkins-shared-libs') _
pipeline {
    agent any
    parameters{
        ([choice(choices: ['build', 'test', 'deploy'], description: 'Select the option', name: 'Operation')])
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
