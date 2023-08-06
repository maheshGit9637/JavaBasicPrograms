package stringPrograms;

public class VowelsCount extends Base {

	public static void main(String[] args) {
		// vowels a e i o u

		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		String x = Base.b;
		int count = 0;
		int scount = 0;
		for (int i = 0; i < vowels.length; i++) {

			char v = vowels[i];
			for (int j = 0; j < x.length(); j++) {
				if (v == x.charAt(j)) {
					count++;
				}
			}

		}
		
		for (int j = 0; j < x.length(); j++) {
			if (x.charAt(j)==' ') {
				scount++;
			}
		}
		System.out.println("total count of characters in string : " + (x.length()-scount));
		System.out.println("total count of vowels : " + count);
		System.out.println("total count of consonents : " + (x.length() - count-scount-1));

	}

}
