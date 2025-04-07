pipeline {
    agent { label "worker-1" }
   
    stages {
        stage('Pull') {
            steps {
                git branch: 'master', url: 'https://github.com/rajatpzade/studentapp.ui.git'
            }
        }
        stage('Build') {
            steps {
            
                sh 'mkdir -p student'
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