//program to demonstrate working of parent and child class constructors
package DurgaDemo01;

class P {
	P() { // whenever we create a child class object, at that time along with child class
			// constructor parent class constructor is also created,
		System.out.println(this.hashCode()); // but parent class object is not created
	}
}

class C extends P {

	C() {
		System.out.println(this.hashCode());
	}
}

public class DurgaTest01 {

	public static void main(String[] args) {
		C c = new C();
		System.out.println(c.hashCode()); //after executing this program only one hashcode is generated which means only one object is created.

	}

}
