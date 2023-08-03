package InterviewPrepJuly;

public class staticVariable {
	    // Static variables
	    static int count = 10;
	    int counter=0;
	    staticVariable(int x){
	    	x=count;
	    }
	    
	     

	    public static void main(String[] args) {
	    	staticVariable obj1 = new staticVariable(20);
	    	staticVariable obj2 = new staticVariable(30);
	    	staticVariable obj3 = new staticVariable(40);

	    	System.out.println("count : "+obj1.count);
	    	System.out.println("count : "+obj2.count);
	    	System.out.println("count : "+obj3.count);
	    	
	    	//static variable can be initialized only once
	    	//static variable once initialised value can not be changed by the objects
	       
	    	System.out.println(count);//static variable and static method can be accessed without any object
	    	System.out.println(obj1.counter);//non static or instance variables can only be accessed with the objects
	    	//instance variables are always a non static in java
	    	//instance variable can be accessed by objects of class only
	    	//instance variables or object variables can not be accessed by the class
	    	
	    	
	    
	    
	    }
	}

