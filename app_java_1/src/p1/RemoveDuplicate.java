package p1;

public class RemoveDuplicate {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 3, 4, 4, 5, 5};
		int len = arr.length;
		//int[] temp = new int[arr.length];

		int j = 0;
		for (int i = 0; i < len - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
				
			}
			
		}
		arr[j++] = arr[len - 1];
		for (int k = 0; k < j; k++) {
		System.out.print(arr[k]);

	
}

		}

	}

