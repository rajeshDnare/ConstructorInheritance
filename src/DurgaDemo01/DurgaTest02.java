//program to demonstrate execution of parent class constructor
package DurgaDemo01;

class person {
	String name;
	int age;

	person(String name, int age) {//parent class constructor is also executed for child class object only
		this.name = name;
		this.age = age;
	}
}

class Student extends person{
	int rollNo;
	int marks;

	Student(String name, int age, int rollNo, int marks) {
		super(name, age);
		this.rollNo = rollNo;
		this.marks = marks;
	}
}

public class DurgaTest02 {

	public static void main(String[] args) {
		Student s=new Student("Rajesh",38,111,80);
		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.rollNo);
		System.out.println(s.marks);

	}

}
