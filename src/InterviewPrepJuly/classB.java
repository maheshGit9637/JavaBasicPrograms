package InterviewPrepJuly;
import patterns.A;

public class classB extends A{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("private variable y can not be access here in subclass :"+y);
		//System.out.println("default variable z can not be access here in subclass :"+z);
		System.out.println("protected variable x can be access here in subclass :"+protected_member);
		System.out.println("public variable a can be access here in subclass :"+public_member);
	
	}

}
