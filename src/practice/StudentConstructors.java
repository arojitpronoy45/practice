package practice;

public class StudentConstructors {
	// variable 
	String name;
	int age;
	
	

	public StudentConstructors() {
		System.out.println("Student Parent Class Constructor");
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public StudentConstructors(String name){
		System.out.println("this is one argument constructor");
		System.out.println(name);
		this.name=name;
		
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public StudentConstructors(String name, int age) {
		this("PronoySarker");
		System.out.println("parameterized constructor");
		//this.name=name;
		this.age=age;
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	public static void main(String[] args) {
		StudentConstructors object1 = new StudentConstructors();
		//System.out.println(object1.name);
		StudentConstructors object2 = new StudentConstructors("Pronoy");
		System.out.println(object2.name);
		StudentConstructors object3 = new StudentConstructors("John", 22);
		System.out.println(object3.name + "__" + object3.age);
		
	}

}
