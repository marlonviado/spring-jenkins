pipeline {
    agent any
    tools {
        maven 'Maven_Latest'
    }
    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/marlonviado/spring-jenkins.git']])
                bat 'mvn clean install'
                echo 'MAVEN BUILD COMPLETED!!!'
            }
        }
        stage('Build Docker Image') {
            steps {
                script {
                    bat 'docker build -t mfviado/spring-jenkins:1.0 .'
                    echo 'DOCKER IMAGE BUILDING COMPLETED!!!'
                }
            }
        }
        stage('Push Image to Docker Hub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'aedaf3d6-42d5-4f34-b79a-9832c0daf548', variable: 'DOCKER-HUB-PWD')]) {
                        bat 'docker login -u mfviado -p alrafiell1976'
                    }
                    bat 'docker push mfviado/spring-jenkins:1.0'
                    echo 'DOCKER PUSH COMPLETED!!!'
                }
            }
        }
    }
}