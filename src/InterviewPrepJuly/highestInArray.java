package InterviewPrepJuly;

public class highestInArray {

	public static int findSecondHighest(int[] x) {

		int firsthighest = 0;
		int secondhighest = 0;
		for (int num : x) {

			if (num > firsthighest) {
				secondhighest = firsthighest;
				firsthighest = num;

			} else if (num < firsthighest && num > secondhighest) {
				secondhighest = num;
			}

		}
		return secondhighest;

	}

	public static void main(String ar[]) {

		int arr[] = { 5, 6,7, 2, 3 };

		System.out.println(findSecondHighest(arr));

	}

}
