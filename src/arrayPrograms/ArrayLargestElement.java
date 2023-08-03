package arrayPrograms;

public class ArrayLargestElement {

	public static void main(String[] args) {
		// write a program to print largest element in array

		int[] array = { 500, 4, 2, 5, 10, 100, 200, 300 };
		int highest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > highest) {
				highest = array[i];
			}
		}
		System.out.print("given array : ");
		for (int i:array) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("largest element in array : "+highest);
	}

}
