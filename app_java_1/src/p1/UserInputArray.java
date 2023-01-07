package p1;

import java.util.Scanner;

public class UserInputArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int arr[]=new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();

		}
		for (int j = arr.length-1; j >=0; j--) {
			System.out.print(arr[j]+" ");
		}
		   
		}

	}


