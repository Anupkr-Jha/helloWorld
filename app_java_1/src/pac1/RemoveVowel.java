package pac1;

public class RemoveVowel {
	public static void main(String[] args) {

		String str = "Hello how are you welcome";
		String st = str.toLowerCase();

		char[] ch = st.toCharArray();
		for (int i = 0; i < ch.length; i++) {

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
				ch[i] = 'z';
			}
		}
		for (int j=0;j<ch.length;j++) {
			System.out.print(ch[j]);
		}
	}

}