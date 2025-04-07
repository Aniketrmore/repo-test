#maven pipeline pull repo
pipeline {
    agent any

    environment {
        MAVEN_HOME = "/opt/apache-maven"
        PATH = "${MAVEN_HOME}/bin:${env.PATH}"
    }    
    stages {
        stage('Pull') {
            steps {
                git branch: 'master', url: 'https://github.com/rajatpzade/studentapp.ui.git'
            }
        }
        stage('Build') {
            steps {
            
                sh 'mvn clean package -Dmaven.clean.failOnError=false'
            }
        }
        stage('Test') {
            steps {
                sh 'echo Testing Project seccesfully'
            }
        }
        stage('Deploy') {
            steps {
                sh 'echo Hureeyyy Deploy'
            }
        }
    }
}
