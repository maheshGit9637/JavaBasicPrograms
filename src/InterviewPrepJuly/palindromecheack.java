package InterviewPrepJuly;

class palindromecheack {
	public static boolean isPalindrom(String x) {

		// trim the spaces and convert the string into lowercase

		x = x.replaceAll("//s+", "").toLowerCase();
		int left = 0;
		int right = x.length() - 1;

		while (left < right) {
			if (x.charAt(left) != x.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;

	}
	
	
	public static void main(String[] args) {
		String t1="racecar";
		String t2="xyz";
		
		System.out.println("is t1 string a palindrom3? : "+isPalindrom(t1));
		System.out.println("is t1 string a palindrom3? : "+isPalindrom(t2));
	}
}