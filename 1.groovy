#! /home/satori/.sdkman/candidates/groovy/current/bin/groovy

println("Hello World!!!");

// Function definiution is here
def printme(String str){
  for (i = 0; i <3; i++) {
    println str
  }
}

// Now you can call printme Function
printme "I'm first call for user defined function!"
printme 'Again second call to the same function'
printme ''
