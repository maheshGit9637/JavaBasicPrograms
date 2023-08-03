package arrayPrograms;

import java.util.Arrays;

public class SortArrayElementsAscending {

	public static void main(String[] args) {
		// sort the array elements in ascending order
		// given array 1234
		// ascending order 1234
		// descending order 4321

		int[] a = { 2, 4, 1, 3 };
		System.out.println("orginal array : ");
		for (int i : a) {
			System.out.print(i + " ");
		}

		// Arrays.sort(array object); //ascending order by default

		Arrays.sort(a);
		System.out.println();
		System.out.println("orginal array with ascending order : ");
		for (int i : a) {
			System.out.print(i + " ");
		}

		int[] b = { 2, 4, 1, 3, 5, 8,9,6 };
		int n = b.length;
		// using bubble sort

		System.out.println();
			bubbleSort(b, n);
		 

	}

	private static void bubbleSort(int[] b, int n) {

		 //int[] b = { 2, 4, 1, 3, 5, 8,9,6 };
		for(int i=0;i<n;i++) {
			 
			for(int j=0;j<n-1;j++) {
				 
				int temp=b[j];
				
				if(b[j]>b[j+1]) {
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
			
			
		}
		for (int i : b) {
			System.out.print(i + " ");
		}

	}

}
