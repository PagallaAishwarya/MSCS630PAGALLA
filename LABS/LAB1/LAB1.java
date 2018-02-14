/*
 To change this license header, choose License Headers in Project Properties.
file:EUCLIDext.java
author:Aishwarya Pagalla
assignment: Lab 2
course:MSCS630
assignment due:02/07/2018
version:1.0
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Aishw
 */
public class LAB1 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  while(scan.hasNext()) {
     String plainText = scan.nextLine();
     //reading Input String
     plainText = plainText.toUpperCase();
     //making input caseSensitive
     int[] o = str2int(plainText);
     //refering to method
     for(int i=0;i< o.length;i++) {
        System.out.print(o[i] + " ");
     }
        System.out.println();
     }
  }  
  //static method
  static int[]  str2int(String plainText){
      
  int[] output = new int[plainText.length()];
  plainText = plainText.toUpperCase();
     for(int i=0;i<plainText.length();i++) { 
     char c = plainText.charAt(i);
     // varaiable gets ascii code of input entered
     if(c == 32)
     output[i] = 26;
     else
        output[i] = (((int) c)-65);
     }
     return output;
     //returns the output value 
     }
  }  
   
