pipeline {
    agent any
    tools {
        maven '.maven'
    }
    environment {
        MAVEN_HOME = tool '.maven'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/thepavansai/formula1'
            }
        }
        stage('Maven Clean') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn clean"
            }
        }
        stage('Build') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn install"
            }
        }
        stage('Test') {
            steps {
                sh "${MAVEN_HOME}/bin/mvn test"
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
