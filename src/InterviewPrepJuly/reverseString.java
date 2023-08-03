package InterviewPrepJuly;

public class reverseString {

	public static String reverse(String x) {

		String y = "";
		int i = x.length()-1;

		for (i = x.length()-1; i >=0; i--) {
			y = y + x.charAt(i);
		}
		return y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "mahesh";
		System.out.println("reversed string of given string : " + x + " is " + reverse(x));

	}

}
