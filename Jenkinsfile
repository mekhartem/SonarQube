pipeline {

    agent any

    tools {
        maven "3.8.5"
    }

    stages {

        stage("build") {

            steps {
                sh 'mvn clean install -DskipTests'
            }
        }

        stage("test") {

            steps {
                sh 'mvn test'
            }
        }

    }
}
