package PracticeHome;

public class InnerClass {

	String name;
	int id;

	public InnerClass() {

	}

	public InnerClass(String name) {
		this.name = name;
	}

	public InnerClass(int id) {
		System.out.println("d");

		this.id = id;

	}

	public static void main(String[] args) {
		InnerClass in = new InnerClass();
		System.out.println(in);
		InnerClass in2 = new InnerClass("gf");
		System.out.println(in2.name);
		InnerClass in3 = new InnerClass(22);
		System.out.println(in3.id);

	}
}
