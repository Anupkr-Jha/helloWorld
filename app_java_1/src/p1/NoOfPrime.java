package p1;

public class NoOfPrime {

	public static void main(String[] args) {
		int num = 20;
		for (int j = 1; j <=num; j++) {
			int count = 0;
            for (int i = 2; i <=j/2; i++) {
				
			if (j % i == 0) {
				count++;
				break;
			}

		}
	
		if(count==0) {
			System.out.print("prime num--"+j+" ");
		}
	}
		}
}
