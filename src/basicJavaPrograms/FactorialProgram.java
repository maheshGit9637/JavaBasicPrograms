package basicJavaPrograms;

public class FactorialProgram {
	
	static int factorial(int n) {
		
		if (n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//factorial of number n= n(n-1)(n-2)(n-3)...(n-n+1)
		
		
		int n=5;
		int sum=1;
		for (int i=n;i>1;i--) {
			sum=sum*i;
		}
		System.out.println(sum);
		
		System.out.println(factorial(5));
		
	}

}
