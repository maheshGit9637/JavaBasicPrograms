package InterviewPrepJuly;

public class fibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0, b = 1, c;
		c = a + b;

		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
		// a b c
		
		for (int i = 0; i < 12; i++) {

			if (i == 0) {
				System.out.print(a + ",");
			}else if(i==1) {
				System.out.print(b + ","+b+",");
			}

			else if (i >= 2) {
				c = a + b;
				System.out.print(c + ",");

			}

			a = b;
			b = c;
		}

	}

}
