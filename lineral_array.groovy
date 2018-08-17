#! /home/satori/.sdkman/candidates/groovy/current/bin/groovy

import java.io.File;
import java.io.FilenameFilter;

File folder = new File("/home/satori/projects/groovy/functions/web/webSmokeTest/");
File[] listOfFilesF = folder.listFiles();
  String[] listOfFiles = new String[listOfFilesF.length];

  for (int i = 0; i < listOfFilesF.length; i++) {
    //if (listOfFilesF[i].name.startsWith("_")) {
    if (listOfFilesF[i].name.endsWith("Cept.php")) {
      listOfFiles[i] = (listOfFilesF[i].getName().split("\\.")[0]);
      println listOfFiles[i];
      //listOfFiles.remove();
    }
  }
///////////////////////////////////////////////////////////////////////////////

// package com.tutorialspoint;
//
// import java.io.File;
//
// public class FileDemo {
//
//    public static void main(String[] args) {
//       File f = null;
//       File[] paths;
//
//       try {
//
//          // create new file
//          f = new File("/home/satori/projects/groovy/functions/web/webSmokeTest");
//
//          // returns pathnames for files and directory
//          paths = f.listFiles();
//
//          // for each pathname in pathname array
//          for(File path:paths) {
//
//             // prints file and directory paths
//             System.out.println(path);
//          }
//
//       } catch(Exception e) {
//
//          // if any error occurs
//          e.printStackTrace();
//       }
//    }
// }

///////////////////////////////////////////////////////////////////////////////

// FilenameFilter _Filter = new FilenameFilter() {
//     public boolean accept(File file, String name) {
//         if (!name.startsWith("_")) {
//             return true;
//         } else {
//             return false;
//         }
//     }
// }
//
// String dirPath = "/home/satori/projects/groovy/functions/web/webSmokeTest"
// File dir = new File(dirPath);
// File[] arrFiles = dir.listFiles(_Filter);
// List<File> lst = Arrays.asList(arrFiles);
//
// //println lst
// //println lst.size()
// //println lst[0]    //First element of array selected and printed
//
// for (String item : lst) {
//     //println item
//    System.out.println(/*"web " + */item - "/home/satori/projects/groovy/functions/web/webSmokeTest/")
// }

///////////////////////////////////////////////////////////////////////////////

// new File("/home/satori/projects/groovy/functions/web/webSmokeTest").listFiles().each { def f ->
//     if (!f.name.startsWith("_")) {
//     println f.name
//   }
// }

///////////////////////////////////////////////////////////////////////////////

// /*File folder = */new File('/home/satori/projects/groovy/functions/web/webSmokeTest')
// /*folder*/.eachFileMatch(~/.*.php/) { file ->
//     if (!file.name.startsWith("_")) {
//         println file.getName()
//     }
// }
