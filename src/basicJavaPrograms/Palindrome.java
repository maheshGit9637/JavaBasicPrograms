package basicJavaPrograms;

import java.util.Scanner;

public class Palindrome {

	static void isPalindrome(String y) {
		int right = y.length() - 1;
		int left = 0;
		boolean flag = false;

		while (left <= right) {
			if (y.charAt(left) == y.charAt(right)) {
				flag = true;
				left++;
				right--;
			} else {
				flag = false;
				break;
			}
		}

		System.out.println("is string a palindrome : " + flag);
	}

	public static void main(String[] args) {

		System.out.println("welcome to the program, here i will check if given string is palidrome or not");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string that you want to check : ");
		String input = sc.nextLine();
		System.out.println("you have entered following string : " + input);
		isPalindrome(input);

	}

}
