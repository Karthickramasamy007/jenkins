def call(String name, String dayOfWeek) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
  sh "Below should list all PWD and files"
  sh "pwd"
  sh "Below should list all files"
  sh "ls -l"
}
