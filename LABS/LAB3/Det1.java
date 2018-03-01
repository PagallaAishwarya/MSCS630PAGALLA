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
            }
        }      
        System.out.println(detOfMatrix(M, n)%l);

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
        	int sign = 1; 
        	double b[][] = new double[n-1][n-1];
    		for(int x = 0 ; x < n ; x++){
    			int i1=0,j1=0;
    			for(int i = 1;i < n; i++){
    				for(int j = 0; j < n;j++){
    					if(j != x){
    						b[i1][j1++] = M[i][j];
    						if(j1 % (n-1) == 0){
    							i1++;
    							j1=0;
    						}
    					}
    				}
    			}
    			d =  (d+ M[0][x] *detOfMatrix(b, n-1) *sign);
    			sign = -sign;
    		}
    	}
		return d;
    }
}

