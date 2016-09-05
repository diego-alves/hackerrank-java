node {
    def v = version()
    echo    "Build version $v"
    
    stage   'compile'
    sh      './gradlew clean build jacoco javadoc -PignoreTestFailures'
    
    stage   'Publish Test Results'
    archive '**/build/libs/*.jar'

    step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/TEST-*.xml'])
    step([$class: 'JavadocArchiver', javadocDir: 'build/docs/javadoc/'])
    
}

def version() {
    def matcher = readFile('gradle.properties') =~ 'version=(.+)'
    matcher ? matcher[0][1] : null
}