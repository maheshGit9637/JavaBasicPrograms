package patterns;

public class LeftAngledTrianlge {

	public static void main(String[] args) {
		for(int i=0;i<4;i++) {
			for(int s=3;s>i;s--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}

	}

}
