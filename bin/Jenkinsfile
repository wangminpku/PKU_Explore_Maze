pipeline {
	agent any   
	stages {
        stage('Build') { 
            steps {
                sh 'mvn compile' 
            }
        }
		stage('Test') {
				steps {
						sh 'mvn test'
                        sh 'mvn cobertura:cobertura -Dcobertura.report.format=xml'
                        sh 'mvn findbugs:findbugs'
                        sh 'mvn pmd:pmd'
				}
		}
		stage('Archive') {
				steps {
                                        sh 'mvn package'
						archiveArtifacts artifacts: 'target/explore_maze_demo-1.0-SNAPSHOT.jar'
				}
		}
    }
    post {
        always {
            junit 'target/surefire-reports/*.xml'
            cobertura coberturaReportFile: 'target/site/cobertura/coverage.xml'
            step([$class: 'FindBugsPublisher', pattern: 'target/findbugsXml.xml'])
            step([$class: 'PmdPublisher', pattern: 'target/pmd.xml'])
        }
    }
}
