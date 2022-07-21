//Whenever we are creating Child Object automatically abstract class constructor is will be executed to perform initialization of child object for the
//properties inheriting from abstract class

package DurgaAbstractClassDemo;

abstract class Person { //parent Abstract class of Class Student
	String name;
	int age;
	int height;
	int weight;

	public Person(String name, int age, int height, int weight) { //Abstract class constructor
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

}
