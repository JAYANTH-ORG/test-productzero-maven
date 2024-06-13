@Library('jenkins-shared-libs') _
pipeline {
    agent any
   parameters {
        // string(name: 'MY_PARAM', defaultValue: 'default_value', description: 'Description for my parameter')
        choice(name: 'Operation', choices: ['build', 'test', 'deploy'], description: 'Choose an option')
    }
    // properties {
    //     choice(
    //         choices: ['build', 'test', 'deploy'],
    //         description: 'Select the option',
    //         name: 'Operation'
    //     )
    // }
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
