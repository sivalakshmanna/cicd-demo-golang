//Declarative pipeline
pipeline {
    agent any
    }
    stages {
        stage("Checkout code") {
            steps {
                println "Clone our code to our repo"
                sh "ls -l"
                sh "ls -lart ./*"
                //credentialsId: 'slaveid',
                git branch: 'main' url: 'https://github.com/sivalakshmanna/cicd-demo-golang'
            }
        }
        stage("Build code"){
            steps {
                println "go build"
                sh "go build main.go"
                sh "ls -l target/"
            }
        }
    }