package arrayPrograms;

public class SecondHighestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] b= {1,2,3,12,11,10,6,7,8};

		// lets sort the array using bubble sort

		int n = b.length;

		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n - 1; j++) {
				int x=b[j];
				if(b[j]>b[j+1]) {
					b[j]=b[j+1];
					b[j+1]=x;
				}
			}
		}
		//lets print the array in sorted order ascending order
		for(int i:b) {
			System.out.print(i+" ");
		}
		
		//lets print the second highest element in array
		System.out.println();
		System.out.println("second highest element in array : "+b[n-2]);

	}

}
