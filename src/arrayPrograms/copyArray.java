package arrayPrograms;

public class copyArray {

	public static void main(String[] args) {

		int a[]= {1,2,3,4};
		int b[] = new int[a.length];
		for (int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		System.out.println("original array : a");
		for (int x:a) {
			System.out.println(x+" ");
		}
		
		System.out.println("copied array : b");
		for (int x:b) {
			System.out.println(x+" ");
		}

	}

}
