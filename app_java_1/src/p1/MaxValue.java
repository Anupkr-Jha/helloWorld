package p1;

public class MaxValue {
public static void main(String[] args) {
	
	int[] num= {20,5,10,30,50};
	int maxNum=num[0];
	for (int i = 1; i <= num.length-1; i++) {
		if(maxNum<num[i]) {
			maxNum=num[i];
		}
		
	}
	System.out.println(maxNum);
}
}
