package basicJavaPrograms;

class demo{
	
	String name;
	int age;
	
	 public demo(String name,int age) {
		this.name=name;
		this.age=age;
	}
}

class Test{
	int x;
}

public class CreateObjects {

	public static void main(String[] args) {
		//create object name, create a memory with new keyword
		//className objectName=new className();
		demo d1=new demo("mahesh",30);
		demo d2=new demo("mangesh",26);
		System.out.println("object d1 : name="+d1.name+" age="+d1.age);
		System.out.println("object d2 : name="+d2.name+" age="+d2.age);
		
		Test t1=new Test();
		//new keyword create a space in heap memory for that object and 
		//Test() is the constructor of the class which is instantiate the data members
		System.out.println(t1.x);
	}

}
