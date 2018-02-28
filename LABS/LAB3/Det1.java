
/**
file:Det1.java
author:Aishwarya Pagalla
assignment: Lab 3
course:MSCS630
assignment due:02/28/2018
version:1.0 
*/


import java.util.Scanner;

public class Det1 {
    public static void main(String args[]){
        System.out.println("enter the order of square matrix");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter a value for modulo");
        int l = input.nextInt();
        System.out.println("enter "+ n*n + " elements for matrix");
        double M [][] = new double[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                M[i][j] = input.nextDouble();
                M[i][j] =M[i][j]%l;
            }
        }
               System.out.println(detOfMatrix(M, n));

    }

    /**
     * Method : detOfMatrix to calculate determinant of the matrix
     */
    public static double detOfMatrix(double M[][],int n){
        double d=0;
    	if(n==0) {
             d = 0;
        }
        if (n==1) {
             d = M[0][0];
        }
        else if (n==2){
            d = (M[0][0]*M[1][1])-(M[0][1]*M[1][0]);
        }
        else {
        	//sys = 1;
        	 for(int j1 = 0;j1 < n;j1++)
             {
        		 int s = 1; 
        		 double[][] m = new double[n-1][];
                 for(int k=0;k<(n-1);k++)
                 {
                     m[k] = new double[n-1];
                 }
                 for(int i=1;i<n;i++)
                 {
                     int j2=0;
                     for(int j=0;j<n;j++)
                     {
                         if(j == j1)
                             continue;
                         m[i-1][j2] = M[i][j];
                         j2++;
                     }
                 }
                d += s * m[0][j1] * detOfMatrix(m, n - 1);
                // terms are to be added with alternate sign
               int temp = s;
               s = -temp;
                temp=s;
                 
             }
        }
       
		return d;
    }
}

