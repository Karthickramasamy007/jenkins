def call(String name, String dayOfWeek) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
  script {
                   GIT_COMMIT_EMAIL = sh (
                        script: 'pwd',
                        returnStdout: true
                    ).trim()
                    echo "Git committer email from groogy karthi: ${GIT_COMMIT_EMAIL}"
                }
}
