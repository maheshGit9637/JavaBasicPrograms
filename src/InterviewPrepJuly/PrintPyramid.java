package InterviewPrepJuly;

public class PrintPyramid {

	public static void main(String[] args) {
		 
		int n=5;
		for (int i=1;i<=n;i++) {//outer loop
			for (int s=4;s>=i;s--) {//space
				System.out.print(" ");
			}


			for (int j=i;j>=1;j--) {
				System.out.print(j);
			}
			
			for (int k=2;k<=i;k++) {
				System.out.print(k);
			}
			
			
			
		System.out.println();}
	}

}
