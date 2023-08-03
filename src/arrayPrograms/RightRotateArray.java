package arrayPrograms;

public class RightRotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 500, 4, 1, 2, 5, 10, 100, 200, 300, 150 };
						//0  1	2  3  4  5   6      7   8   9	
		int lastElement = array[array.length - 1];
		
		for (int i=array.length-1;i>0;i--) {
			array[i]=array[i-1];
			array[i-1]=lastElement;
		}
		for (int i:array) {
			System.out.print(i+" ");
		}
	}

}
