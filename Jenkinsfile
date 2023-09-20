pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/komalsinghh/Springboot-Docker.git']])
 script {
                    def workspace = pwd()
                    sh "ls -al ${workspace}"
                }
                           }
        }
        stage('Build') {
            steps {
                dir('DevOpsAssignment/Springboot-Docker/Springboot-Docker') {
                    bat 'mvn clean package'
                }
            }
        }
    }
}
