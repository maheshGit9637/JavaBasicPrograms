package basicJavaPrograms;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * what is a prime number? a number divisible only by itself and not by any
		 * other number
		 * 
		 */

		int number = 10062;
		boolean isdivisible = false;
		for (int i = 2; i <= 10; i++) {
			if (number % i == 0) {
				isdivisible = true;
				break;
			} else {
				isdivisible = false;
			}

		}
		
		System.out.println("is given number "+number+" a prime number ?"+!isdivisible);

	}

}
