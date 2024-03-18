package practice;

public class ConstructorChaining {

	public ConstructorChaining() {
		System.out.println("default");
	}
	
	public ConstructorChaining (String name) {
		this();
		System.out.println("this is one argument");
	}
	
	public ConstructorChaining (String name, int age) {
		this("Pronoy");
		System.out.println("this is two argument");
	}
	public static void main(String[] args) {
		
		new ConstructorChaining();
		new ConstructorChaining("Pronoy");
		new ConstructorChaining("Pronoy", 21);
		
		
	}
}
