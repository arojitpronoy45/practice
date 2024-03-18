package practice;

public class Constructor {
	// variable 
	String name;
	int age;
	
	

	public Constructor() {
		System.out.println("default constructor");
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public Constructor(String name){
		this.name=name;
		
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public Constructor(String name, int age) {
		this.name=name;
		this.age=age;
	}

	// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------//

	public static void main(String[] args) {
		Constructor object1 = new Constructor();
		System.out.println(object1.name);
		Constructor object2 = new Constructor("Pronoy");
		System.out.println(object2.name);
		Constructor object3 = new Constructor("John", 22);
		System.out.println(object3.name + "__" + object3.age);
		
	}

}
