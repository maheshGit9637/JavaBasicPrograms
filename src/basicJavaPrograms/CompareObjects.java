package basicJavaPrograms;

public class CompareObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String x=new String("hello");
		String y=new String("hello");
		String z=new String("world");
		
		System.out.println("is value of string x and string y same ? : "+x.equals(y));
		//equal() method compare the content available in the memory location
		//== comparison operator compares if two memory locations are different
		
		
		System.out.println("is x and y objects refers to same memory locaiton ? "+(x==y));
		
		System.out.println("is value of string x and string y same ? : "+x.equals(z));
		
		

	}

}
