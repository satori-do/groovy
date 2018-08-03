#! /home/satori/.sdkman/candidates/groovy/current/bin/groovy

///////////////////////////////////////////////////////////////////////////////

// File dir = new File("/home/satori/projects/groovy/functions/web/webSmokeTest");
// File[] arrFiles = dir.listFiles();
// List<File> lst = Arrays.asList(arrFiles);
//
// //println lst
// //println lst.size()
// //println lst[0]    //First element of array selected and printed
//
// for (String item : lst) {
//    System.out.println(item)
// }

///////////////////////////////////////////////////////////////////////////////

// new File("/home/satori/projects/groovy/functions/web/webSmokeTest").listFiles().each { def f ->
//     println f.name
// }

///////////////////////////////////////////////////////////////////////////////

File folder = new File('/home/satori/projects/groovy/functions/web/webSmokeTest')

folder.eachFileMatch(~/.*.php/) { file ->
    if (!file.name.startsWith("_")) {
        println file.name
    }
}
