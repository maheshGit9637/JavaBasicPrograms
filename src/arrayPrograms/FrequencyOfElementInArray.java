package arrayPrograms;

import java.util.HashMap;

public class FrequencyOfElementInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 4, 2, 4, 4, 7, 1, 1 };

		for (int i = 0; i < a.length; i++) {
			int count = 1;
			if (a[i] != 999) {
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						count++;
						a[j] = 999;
					}

				}

				System.out.println(a[i] + "-" + count);
			}

		}

	}

}
