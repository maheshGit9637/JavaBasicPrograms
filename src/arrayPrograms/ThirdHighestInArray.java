package arrayPrograms;

public class ThirdHighestInArray {

	public static void main(String[] args) {
		// given array
		
		int[] b= {1,2,3,12,11,10,6,7,8};
		
		int n=b.length;
		
		//lets sort the array
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-1;j++) {
				int x=b[j];
				if(b[j]>b[j+1]) {
					b[j]=b[j+1];
					b[j+1]=x;
				}
			}
		}
		for (int i:b) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("third highest element in array : "+b[n-3]);

	}

}
