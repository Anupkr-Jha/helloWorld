package p2;

public class Abc {
	public static void main(String[] args) {

		int[] a = { 2, 2, 1, 3, 3, 4, 4, 4, 5, 5 };
		//int[] b = new int[a.length];
		int j = 0;
		int len = a.length;
		for (int i = 0; i < len - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[j++] = a[i];
			}
		}
		a[j++] = a[len - 1];
		for (int k = 0; k < j; k++) {
			
			System.out.println(a[k]);

		}
	}
}
