package stringPrograms;

public class TotalCharactersInString extends Base{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String x=Base.b;
		System.out.println("given string is : "+x);
		System.out.println("total number of characters in string : "+x.length());
		
		int count=0;
		for(int i=65;i<91;i++) {
			 char test=(char)i;
			 for(int j=0;j<x.length();j++) {
				 if(test==x.charAt(j)) {
					 count++;
					 break;
				 }
			 }
		}
		
		for(int i=97;i<123;i++) {
			 char test=(char)i;
			 for(int j=0;j<x.length();j++) {
				 if(test==x.charAt(j)) {
					 count++;
					 break;
				 }
			 }
		}
 
		System.out.println(count);
		 
	}

}
