package chap1;
import java.util.*;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows of A:");
        int noOfRow1=sc.nextInt();
        System.out.println("Enter number of columns of A:");
        int noOfCol1=sc.nextInt();
        System.out.println("Enter number of rows of B:");
        int noOfRow2=sc.nextInt();
        System.out.println("Enter number of columns of B:");
        int noOfCol2=sc.nextInt();
        if(noOfCol1!=noOfRow2) {
        	 System.out.println("Multiplication not possible");
        }
        else {
        	int [][]matrix1=new int[noOfRow1][noOfCol1];
        	 System.out.println("Enter elements of A:");
        	 for(int i=0;i<noOfRow1;i++) {
        		 for(int j=0;j<noOfCol1;j++) {
        			 matrix1[i][j]=sc.nextInt();
        		 }
        	 }
        	 for(int i=0;i<noOfRow1;i++) {
        		 for(int j=0;j<noOfCol1;j++) {
        			 System.out.println(matrix1[i][j]+" ");
        		 }
        	 }
        	 System.out.println("\n");
        }
        int [][]matrix2=new int[noOfRow2][noOfCol2];
        System.out.println("Enter elements of B:");
        for(int i=0;i<noOfRow2;i++) {
   		 for(int j=0;j<noOfCol2;j++) {
   			 matrix2[i][j]=sc.nextInt();
   		 }
   		 for( i=0;i<noOfRow2;i++) {
   		   for(int j=0;j<noOfCol2;j++) {
   			 System.out.println(matrix2[i][j]+" ");
   		 }
   		 System.out.println("\n");
   		 }
   	 int [][]matrix3=new int[noOfRow2][noOfCol2];
     for(i=0;i<noOfRow2;i++) {
		 for(int j=0;j<noOfCol2;j++) {
			 matrix3[i][j]=0;
			 for(int k=0;k<noOfRow2;k++) {
				 int [][]matrix1=null;
				matrix3[i][j]+=matrix1[i][k]*matrix2[k][j];
			 }
		 }
        }
     System.out.println("Product is:\n");
     for( i=0;i<noOfRow2;i++) {
		 for(int j=0;j<noOfCol2;j++) {
			 System.out.println(matrix3[i][j]+" ");
		 }
		 System.out.println("\n");
	}

}
	}  }
