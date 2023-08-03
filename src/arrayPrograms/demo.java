package arrayPrograms;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b = { 1, 4, 2, 7, 19, 16, 99, 87 };

		// lets sort the array using bubble sort

		int n = b.length;

		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n - 1; j++) {
				System.out.println(b[j]);
				 
			}
			if(i==0) {
				break;
			}
		}

	}

}
