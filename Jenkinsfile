pipeline {
    agent any
    tools {
        maven '.maven'
        git 'Git'
    }
    environment {
        MAVEN_HOME = tool '.maven'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/thepavansai/formula1', credentialsId: '09a9b2bd-e5bc-4934-992f-d4dbdd123867', tool: 'Git'
            }
        }
        stage('Maven Clean') {
            steps {
                bat "\"${MAVEN_HOME}/bin/mvn\" clean"
            }
        }
        stage('Build') {
            steps {
                bat "\"${MAVEN_HOME}/bin/mvn\" install"
            }
        }
        stage('Test') {
            steps {
                bat "\"${MAVEN_HOME}/bin/mvn\" test"
            }
        }
        stage('Scan') {
            steps {
                echo "Skipping scan stage"
            }
        }
        stage('Deploy') {
            steps {
                echo "Skipping deploy stage"
            }
        }
        stage('Monitor') {
            steps {
                echo "Skipping monitor stage"
            }
        }
    }
}
