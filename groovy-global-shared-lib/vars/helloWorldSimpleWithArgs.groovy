def call(String name, String dayOfWeek) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
  sh "Below should list all PWD and files"
  sh "pwd"
  sh "Below should renam file hai.txt to hello.txt"
  sh "mv hai.txt hello.txt"
  sh "Below should renam file hgggggggg.txt to hello.txt"
  sh "mv hgggggggg.txt hello.txt"

}
