package InterviewPrepJuly;

public class PrintRightAngledTraingle {

	public static void main(String[] args) {

		int a = 65;

		for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j);

			}
			System.out.println();

		}

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j <= i; j++) {
				System.out.print((char)(a+j));

			}
			System.out.println();

		}

	}

}
