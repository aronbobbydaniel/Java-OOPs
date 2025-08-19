package quwerty;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number of rows:");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int cols=sc.nextInt();
		int[][] matrix= new int[rows][cols];
		int[][] transpose=new int[cols][rows];
		System.out.println("Enter the matrix elements:");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[j][i]+"\t");
			}
			System.out.println();
		}
			
		}
	}
	
