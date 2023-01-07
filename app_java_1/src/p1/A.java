package p1;

public class A {

	public static void main(String[] args) {
		String s1 = "java";
		/*char[] rev = s1.toCharArray();
		for (int i = rev.length- 1; i >= 0; i--) {
			
			System.out.print(rev[i]);*/
		
		int len=s1.length();
		String rev="";
		for(int i=len-1; i>=0; i--) {
			rev=rev+s1.charAt(i);
			
		}
		System.out.print(rev);
		
		}
		
	}

