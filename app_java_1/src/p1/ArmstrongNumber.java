package p1;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int num=153;
		int rem;
		int cube=0;
		int temp;
		temp=num;
		
		while(num>0) {
			rem=num%10;
			num=num/10;
			cube=cube+(rem*rem*rem);
			
		}
		if(temp==cube) {
			System.out.println("number is armstrong::"+cube);
		}
		else {
			System.out.println("number is not armstrong::"+cube);
		}
	}

}
