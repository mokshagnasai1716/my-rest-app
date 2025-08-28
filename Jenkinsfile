pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mokshagnasai1716/my-rest-app.git'
            }
        }

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
