package p1;

import java.util.Scanner;

public class FindGivenNum {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] num = { 0, 1, 0, 0, 0, 1, 1 };
		int num1 = sc.nextInt();
		int count = 0;
		boolean bool=false;
          
		for (int i = 0; i < num.length; i++) {

			if (num1 == num[i]) {
				count++;
             bool=true;
			}
			}
         if(bool==true) {
        	 System.out.println(num1+" present in array "+count+ " times");
         }
         else {
        	 System.out.println(num1+" not present in array ");
         }
		
	}

}