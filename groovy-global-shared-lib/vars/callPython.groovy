def call() {
  sh "echo Jenkins callPython reached..."
  script {
                   GIT_COMMIT_EMAIL = sh (
                        script: 'python helloPython.py',
                        returnStdout: true
                    ).trim()
                    echo "Git committer email from groogy karthi: ${GIT_COMMIT_EMAIL}"
                }
}