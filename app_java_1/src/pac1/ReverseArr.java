package pac1;

public class ReverseArr {
	public static void main(String[] args) {
		
		//sorting array
		int arr[] = { 10, 5, 20, 25, 30, 8 };

		int temp;
		for (int i = 0; i < arr.length - 1; i++) {

			for (int j = 0; j < arr.length - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
          for (int a : arr) {
        	  System.out.println(a);
			
		}
		}
	}

