
	/**
	file:hex.java
	author:Aishwarya Pagalla
	assignment: Lab 3
	course:MSCS630
	assignment due:02/28/2018
	version:1.0 
	*/
import java.util.Arrays;
import java.io.BufferedInputStream;
import static java.lang.Math.ceil;
import java.util.Scanner;

		public class hex {
      // promts user to enter character for modulo and also string as plaintext
		  public static void main(String[] args) {
		    StringBuilder sb = new StringBuilder();
		    Scanner input = new Scanner(new BufferedInputStream(System.in));
		    System.out.println("enter a character for padding ");
		   char A = input.nextLine().charAt(0);
			System.out.print("enter a string");
		   String Text = input.nextLine();
		    int rem = (int) ceil(Text.length() / 16.0);
		    sb.append(Text);
		    for (int i = 0; i <= ((rem * 16) - Text.length() - 1); i++) {
		      sb.append(A);
		    }
		    int count = 0;
		    for (int i = 0; i < rem; i++) {
		      String temp = sb.substring(count, count + 16);
		      count = count + 16;
		      Mat(get(A, temp));
		    }

		  }
//method get : to pad character given and display 4x4 matric of the outputs
		  public static int[][] get(char A, String Text) {
		    if (Text.length() < 16) {
		      for (int i = 0; i < 16 - Text.length(); i++) {
		        Text = Text + A;
		      }
		    }
		    char[] c = Text.toCharArray();
		    int[][] temp = new int[4][4];
		    int index = 0;
		    for (int i = 0; i < 4; i++) {
		      for (int y = 0; y < 4; y++) {
		        temp[y][i] = (int) c[index++];
		      }
		    }
		    return temp;
		  }
		  //converts ascci to hexadecimal and display matrix
		  private static void Mat(int[][] matrix) {
		    for (int i = 0; i < 4; i++) {
		      for (int y = 0; y < 4; y++) {
		    	  String s=Integer.toHexString(matrix[i][y]);
		        System.out.print( s.toUpperCase()+ " ");
		      }
		      System.out.println();
		    }
		    System.out.println();
		  }
		}

	


		
