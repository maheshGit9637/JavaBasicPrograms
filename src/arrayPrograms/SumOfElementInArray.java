package arrayPrograms;

public class SumOfElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 500, 4, 1, 2, 5, 10, 100, 200, 300 };
		int sum=0;
		
		for(int i:array) {
			sum=sum+i;
		}
		
		System.out.println("sum of all array elements in array : "+sum);
	}

}
