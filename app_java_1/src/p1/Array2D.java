package p1;

import java.util.Scanner;

public class Array2D {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][2];
		
		//System.out.println(arr[0].length);
		System.out.println("Enter the number");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				
				arr[i][j]=sc.nextInt();

			}
		}
		}
	}


