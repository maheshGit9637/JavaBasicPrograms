package basicJavaPrograms;

import java.util.Scanner;

public class PrintArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("enter any number of your choice : ");
		int n = sc.nextInt();
		String num = String.valueOf(n);
		int num_of_digits = num.length();

	 

		/*
		 * An Armstrong number (also known as a narcissistic number, pluperfect digital
		 * invariant, or plus perfect number) is a number that is equal to the sum of
		 * its own digits each raised to the power of the number of digits in the
		 * number.
		 * 
		 */
		int m = 1;
		int sum = 0;

		for (int i = 0; i < num_of_digits; i++) {
			char ch = num.charAt(i);
			int digit = Character.getNumericValue(ch);

			for (int j = 0; j < num_of_digits; j++) {
				m = m * digit;
			}
			sum = sum + m;
			m = 1;

		}

		if(n==sum) {
			System.out.println("number is armstrong number");
		}else {
			System.out.println("number is not a armstrong number");
		}
		
		

}
}
