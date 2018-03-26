/*
file:EUCLID.java
author:Aishwarya Pagalla
assignment: Lab 2
course:MSCS630
assignment due:02/07/2018
version:1.0
*/

import java.util.Scanner;

public class EUCLID {
   public static void main(String args[]){
	//prompts user to enter input
	Scanner S = new Scanner(System.in);
        System.out.println("enter values for a and b");
        long a = S.nextLong();
        long b = S.nextLong();
	long g = gcd(a,b);
        //condition - a always greater than b for a/b
	if (a>=b){
          System.out.println("GCD of  " + a + " & " + b +" is : " + g);}
        else {
        //swap if a less than b;
          long temp = a;
          a = b;
          b = temp;
          System.out.println("GCD of  " + a + " & " + b +" is : " + g);
   }
      }
		
   private static long gcd(long a, long b) { 
   //base condition - if b = 0
    if(b == 0){
    return a; 
    }
    return gcd(b, a%b);	
	}
	
}
