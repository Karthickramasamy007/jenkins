def call(String name, String dayOfWeek) {
  sh "echo Hello World ${name}. It is ${dayOfWeek}."
  sh "Below should renam file hai.txt to hello.txt"
  sh ("pwd")
  sh ("mv hai.txt hello.txt")
  sh "Below should renam file hgggggggg.txt to hello.txt"
  sh "mv hgggggggg.txt hello.txt"

}
