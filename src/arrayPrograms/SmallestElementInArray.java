package arrayPrograms;

public class SmallestElementInArray {

	public static void main(String[] args) {
		int[] b= {1,2,3,12,11,10,6,7,8};
		
		//lets sort the array
		
		int n=b.length;
		
		for (int i=0;i<n;i++) {
			for (int j=0;j<n-1;j++) {
				int x=b[j];
				if(b[j]>b[j+1]) {
					b[j]=b[j+1];
					b[j+1]=x;
				}
				
			}
		}
		for(int i:b) {
			System.out.print(i+" ");
		}System.out.println();

		System.out.println("smallest element in array : "+b[0]);
	}

}
