package DurgaAbstractClassDemo;

public class Student extends Person { //child class
	int rollNo;
	int marks;

	public Student(String name, int age, int height, int weight, int rollNo, int marks) {
		super(name, age, height, weight);
		this.rollNo = rollNo;
		this.marks = marks;

	}

	public static void main(String[] args) {
		Student s = new Student("Rajesh", 38, 5, 60, 111, 80);

		System.out.println(s.name);
		System.out.println(s.age);
		System.out.println(s.height);
		System.out.println(s.weight);
		System.out.println(s.rollNo);
		System.out.println(s.marks);
	}

}
