package arrayPrograms;

public class LeftRotateArray {

	public static void main(String[] args) {
		// given array {1,2,3,4}
		//output shall {2,3,4,1}
		
		int[] a={1,2,3,4};
		int n1=a[0];
		
		System.out.println("original array");
		for (int i=0;i<=3;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for (int i=1;i<=3;i++) {
			 
			a[i-1]=a[i];
			a[i]=n1;
			
		}
		System.out.println("left shifted array");
		for (int i=0;i<=3;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
