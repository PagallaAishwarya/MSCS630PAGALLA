/*
file:EUCLIDext.java
author:Aishwarya Pagalla
assignment: Lab 2
course:MSCS630
assignment due:02/07/2018
version:1.0
*/


import java.util.Scanner;

public class EUCLIDext {

  // roots x,y for a,b 
 public void root(long a, long b){
    long x = 0, y = 1, x0 = 1, y0 = 0, temp;
    //for b not equals to zero calculate quotient and remainder
    while (b != 0) {
        long q = a / b, r = a % b;
        a = b;
	b = r;
        temp = x;
        x = x0 - q * x;
        x0 = temp;
        temp = y;
        y = y0 - q * y;
        y0 = temp;
        }
     System.out.println(" x : "+ x0 +" y :"+ y0);
	 long g = gcd(a,b);
	}
	 
  public static void main(String args[]){
      Scanner Scan = new Scanner(System.in);
      System.out.println("enter values of a and b");
      //prompts user to enter two numbers
      long a = Scan.nextLong();
      long b = Scan.nextLong();
      EUCLIDext f = new EUCLIDext();
      f.root(a,b);
      //condition for gcd(a,b) :: a>=b
      if (a>=b){
         long g = gcd(a,b);	
	}
     else {
         long temp = a;
         a = b;
         b = temp;
	 long g = gcd(a,b);
         System.out.println("gcd of " +a+ " & "+b+ " is " +g );
          }
          }
	
  // Method calculates GCD for b == 0	
  private static long gcd(long a, long b ){
   //for one number equals zero:base case
        if(b == 0){
        long x, y;
	 x=1;
         y=0;
         return a;
	}
         return gcd(b,a%b);	
        }
}



	
		
		
	

