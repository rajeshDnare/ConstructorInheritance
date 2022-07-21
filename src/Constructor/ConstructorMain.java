package Constructor;

class A{
	protected A() {
		System.out.println("Constru in class A");
	}
}

class B extends A{
	public B() {
		System.out.println("Constru in class B");
	}
}
public class ConstructorMain extends ConstructorDemo01{
	
	public static void main(String[] args) {
		B b=new B();
		
	}

}
