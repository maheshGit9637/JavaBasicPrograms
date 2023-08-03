package InterviewPrepJuly;

public class SecondHighestNumber {
 
 
 

	    public static int[] findSecondHighest(int[] arr) {
	        int firstHighest = 0;
	        int secondHighest = 0;
	        for (int num : arr) {
	            if (num > firstHighest) {
	                secondHighest = firstHighest;
	                firstHighest = num;
	            } else if (num > secondHighest && num < firstHighest) {
	                secondHighest = num;
	            }
	        }
	        int x[]= {firstHighest,secondHighest};
	        return x;
	    }

	    public static void main(String[] args) {
	        int[] numbers = { 1, 4, 5, 100, 90 };
	        int[] secondHighest = findSecondHighest(numbers);
	        System.out.println("The first highest element is: " + secondHighest[0]);
	        System.out.println("The second highest element is: " + secondHighest[1]);
	    }
	}
