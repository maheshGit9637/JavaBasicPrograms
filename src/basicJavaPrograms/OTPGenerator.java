package basicJavaPrograms;

public class OTPGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double d= Math.random();
		String num=String.valueOf(d);
		String digits=num.split("\\.")[1];
		
		String otp="";
		
		for (int i=0;i<9;i++) {
			if ((digits.charAt(i))!='0'&&otp.length()<6) {
				otp=otp+digits.charAt(i);
			}
		}
		System.out.println(otp);
	}

}
