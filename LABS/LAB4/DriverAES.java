/**
file:DriverAES.java
author:Aishwarya Pagalla
assignment: Lab 4
course:MSCS630
assignment:04/13/2018
version:1.0 
*/
import java.io.BufferedInputStream;
import java.util.Scanner;

public class DriverAES {

		  public static void main(String[] args) {
		   Scanner in = new Scanner(new BufferedInputStream(System.in));
		    System.out.println("enter input");
		    while (in.hasNext()) {
		      String input = in.nextLine();
		      if (input.length() == 32) {
		        new AESCipher().aesRoundKeys(input);
		      }
		    }
		  }

		}

