package Constructor;

class ConstructorDemo02 { // parent class

	public ConstructorDemo02() {
		System.out.println("I am constructor in class ConstructorDemo02");
	}
}

public class ConstructorDemo01 extends ConstructorDemo02 { // child class of class "ConstructorDemo02"
	public ConstructorDemo01() {
//		super();
		System.out.println("I am constructor in class ConstructorDemo01");
	}

	public static void main(String[] args) {
		ConstructorDemo01 a = new ConstructorDemo01();

	}
}
