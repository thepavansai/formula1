pipeline {
    agent any
    tools {
        maven '.maven'
    }
    stages {
        stage('Maven clean') {
            steps {

                    bat 'mvn clean'
                }
            }

         stage('Build') {
            steps {
                echo 'Build stage'
            }
        }
        stage('Test') {
            steps {
                echo 'Test'
            }
        }
        stage('Scan') {
            steps {
                echo 'Scan'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploy'
            }
        }
         stage('Monitor') {
            steps {
                echo 'Monitor'
            }
        }

        }
    }
