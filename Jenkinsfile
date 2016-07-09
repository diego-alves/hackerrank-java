node {
    stage 'checkout'
    git url: 'git@github.com:diego-alves/hackerrank-java.git'
    
    def v = version()
    echo "Build version $v"
    
    stage 'compile'
    sh './gradlew clean build javadoc -PignoreTestFailures'
    
    stage 'Publish Test Results'
    step([$class: 'ArtifactArchiver', artifacts: '**/build/libs/*.jar', fingerprint: true])
    step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/TEST-*.xml'])
    step([$class: 'hudson.plugins.checkstyle.CheckStylePublisher', pattern: '**/build/reports/checkstyle/*.xml'])
    step([$class: 'JavadocArchiver', javadocDir: 'build/docs/javadoc/'])
    
    
}

def version() {
    def matcher = readFile('gradle.properties') =~ 'version=(.+)'
    matcher ? matcher[0][1] : null
}