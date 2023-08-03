package InterviewPrepJuly;

public class FindMaxNumber {

	public static int  findmax(int [] x) {
		int max=0;
		for (int num : x) {
			if(num>max) {
				max=num;
			}
		}
		
		
		return max;
	}
	
	
	public static void main(String[] args) {
		 
		int arr[]= {5,6,8,9,100,3,500,67};
		System.out.println("what is max from below array ? : ");
		for (int i:arr) {
			System.out.print(i+",");
		}
		System.out.println("max from given array ? : "+findmax(arr));

	}

}
