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

        stage("sonar") {

            steps {
                sh '''
                    mvn clean verify sonar:sonar \
                      -Dsonar.projectKey=mkh2514543_sonar_AYt8AztKnn269OD-fPh2 \
                      -Dsonar.projectName='sonar' \
                      -Dsonar.host.url=http://localhost:9000 \
                      -Dsonar.token=sqp_50e54febc8128148972ff7028ccc7167e57c65f5
                '''
            }
        }

    }
}
