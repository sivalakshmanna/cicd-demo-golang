pipeline {
    agent any
    
    stages{
        stage("chekout code"){
            steps{
                println "clone our code to our repository"
                sh "ls -l"
                sh "ls -lart ./*"
                git branch: 'main', url: 'https://github.com/sivalakshmanna/cicd-demo-golang'
                

            }
        }
    
        stage("build code"){
            steps{
                println "go build"
                sh "go build main.go"
                
            }
        }
    }
}