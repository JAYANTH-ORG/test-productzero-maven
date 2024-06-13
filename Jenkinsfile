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
                script {
                    echo "[INFO] Loading JSON configuration from : ${env.WORKSPACE}/pipeline.json"
                    def slurper = new groovy.json.JsonSlurper()
                    def jsonObj = slurper.parseText(readFile "${env.WORKSPACE}/pipeline.json")
                    // jsonObj = readJSON file: '${env.WORKSPACE}/pipeline.json'
                    echo "[INFO] Loaded JSON configuration: ${jsonObj}"
                }
            }
        }
         stage('Maven Build') {
            steps {
                MvnBuild(Operation: params.Operation) 
            }
        }
       
    }
}
