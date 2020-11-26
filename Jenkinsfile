pipeline {
    agent any

    stages {
        stage('Compile') {
            steps {
                echo "Compiling..."
                sh "mvn compile"
            }
        }

        stage('Package') {
            steps {
                echo "Packaging..."
                sh "mvn package"
            }
        }
    }
}