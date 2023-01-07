package pac2;

import java.util.Scanner;

public class MobileNoValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your mobile no.");
		String str = sc.nextLine();
		String reg = "[679][0-9]{9}";

		if(str.matches(reg)) {
			System.out.println("Valid mobile no.- "+str);
				
			}
		else {
			System.out.println("Invalid mobile no.- "+str);
				
			}
		}
	}

