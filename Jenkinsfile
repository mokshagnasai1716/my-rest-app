pipeline {
    agent any

    tools {
        jdk 'jdk17'
        maven 'M3'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo '✅ Build and tests passed successfully!'
        }
        failure {
            echo '❌ Build failed or tests did not pass.'
        }
    }
}
