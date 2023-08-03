package InterviewPrepJuly;
class A{
	void method(int a) {
		System.out.println("method from class A with int paramter : "+a);
	}
	void method(double a) {
		System.out.println("method from class A with double paramter : "+a);
	}
}

class B extends A{
	void method(double a){
		System.out.println("method from class B with double paramter : "+a);
	}
}
public class Execute {

	public static void main(String[] args) {
		new B().method(10.0);

	}

}
