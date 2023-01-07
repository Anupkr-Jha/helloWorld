package pac1;

public class NumOfVowel {
public static void main(String[] args) {
	
	String str="JAava learning abcd";
	int len=str.length();
	int count=0;
	
	for(int i=0;i<=len-1;i++) {
		char ch=str.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		count++;
	}
	System.out.println(count);
}
}
