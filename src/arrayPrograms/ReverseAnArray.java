package arrayPrograms;

public class ReverseAnArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int b[]=new int[arr.length];
		int n = arr.length - 1;
		 
		for (int i = n; i >= 0; i--) {
			b[n-i]=arr[i]; 
		}

		for (int i=0;i<=n;i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		for (int i=n;i>=0;i--) {
			System.out.print(b[i]+" ");
		}
		
	}

}
