package ×÷ÒµÌâ;

import java.util.ArrayList;
import java.util.Scanner;

public class S11_9 {
	
	public static void main(String[] args) {
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> column = new ArrayList<>();
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n:");
		
		int n=input.nextInt();
		System.out.println("The radom array is");
		int[][] Matrix=createMatrix(n,n);
	
		System.out.println("The largest row index: "+row(n,n,Matrix));
		System.out.println("The largest column index: "+column(n,n,Matrix));
		input.close();
	}
	
	public static int[][] createMatrix(int row,int column){
		
		int Matrix[][] = new int[row][column];
		for (int i=0;i<=row-1;i++) {
			for(int j=0;j<=column-1;j++) {
				Matrix[i][j]=radomNum();
				System.out.print(Matrix[i][j]);
			}
			System.out.println();
		}
		return Matrix;
	}
	
	public static int radomNum() {
		int Num;
		if(new java.util.Random().nextInt(10)>=5) {
			Num=0;
		}else {
			Num=1;
		}
		return Num;
	}
	
	public static int row(int row,int column,int[][] Matrix) {
		int count[] = new int[row];
		for(int i=0;i<=row-1;i++) {
			count[i]=0;
		}
		for(int i=0;i<=row-1;i++) {
			for(int j=0;j<=column-1;j++) {
				if(Matrix[i][j]==1){
					count[i]=count[i]+1;
				}
			}
		}
		int rnum=0,j=-1;
		for(int i=0;i<=row-1;i++) {
			if(count[i]>j) {
				j=count[i];
				rnum=i;
			}
		}
		return rnum;
	}
	
	public static int column(int row,int column,int[][] Matrix) {
		int count[] = new int[column];
		for(int i=0;i<=column-1;i++) {
			count[i]=0;
		}
		for(int i=0;i<=column-1;i++) {
			for(int j=0;j<=row-1;j++) {
				if(Matrix[i][j]==1){
					count[i]=count[i]+1;
				}
			}
		}
		int cnum=0,j=-1;
		for(int i=0;i<=column-1;i++) {
			if(count[i]>j) {
				j=count[i];
				cnum=i;
			}
		}
		return cnum;
	}
}
