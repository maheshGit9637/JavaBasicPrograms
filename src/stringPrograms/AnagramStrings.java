package stringPrograms;

public class AnagramStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String A = "listen";
		String B = "silent";

		for (int i = 0; i < A.length(); i++) {
			char test = A.charAt(i);
			int count = 0;
			boolean flag = false;
			for (int j = 0; j < B.length(); j++) {
				if (test == B.charAt(j)) {
					flag = true;
					count++;
				}
			}

			if (count == 2||flag==false) {
				flag = false;
				System.out.println("string is not an anagram");
				break;
			}
		}System.out.println("string is an anagram");
		

	}

}
