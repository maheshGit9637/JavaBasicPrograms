package basicJavaPrograms;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int c = 0;
		// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		c = a + b;
		

		for (int i = 0; i < 9; i++) {
			if(i>0) {
				System.out.print(c+",");
				a = b;
				b = c;
				c = a + b;
			}else {
				System.out.print(b+",");
			}
			
		}

	}

}
