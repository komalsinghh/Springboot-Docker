pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
               checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/komalsinghh/Springboot-Docker.git']])
                           }
        }
        stage('Build') {
            steps {
                dir('Docker-Springboot') {
                    bat 'mvn clean package'
                }
            }
        }
    }
}
