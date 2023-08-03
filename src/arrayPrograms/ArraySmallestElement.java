package arrayPrograms;

public class ArraySmallestElement {

	public static void main(String[] args) {
		// write a program to print smallest element in array
		
		int[] array = { 500, 4, 1,2, 5, 10, 100, 200, 300 };
		int smallest=999999999;
		for (int i:array) {
			if(i<smallest) {
				smallest=i;
			}
		}
		System.out.print("given array : ");
		for (int i:array) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("smallest element in array : "+smallest);

	}

}
