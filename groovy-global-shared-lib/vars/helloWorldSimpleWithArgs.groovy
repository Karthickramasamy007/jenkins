def call(String name, String dayOfWeek) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
  sh "Below should run python code"
  sh(script: "pwd")

}
