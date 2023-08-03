package arrayPrograms;

public class ArrayOddElements {

	public static void main(String[] args) {

		int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };

		for (int i = 0; i < array.length; i++) {
			if(i%2!=0) {
			System.out.println("array element at position "+i+" "+array[i]);	
			}
		}

	}

}
