package patterns;

public class DiagonalStar {
	
	public static void rightdiagonal() {
		for(int i=0;i<4;i++) {
			for (int s=0;s<i;s++) {
				System.out.print("  ");
			}
			
			for (int j=i;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	public static void leftdiagonal() {
		for(int i=0;i<4;i++) {
			for (int s=3;s>i;s--) {
				System.out.print("  ");
			}
			
			for (int j=i;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		
		
		int k;
		for (k=0;k<10000;k++) {
			rightdiagonal();
			leftdiagonal();
		}
	}

}
