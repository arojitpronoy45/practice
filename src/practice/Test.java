package practice;

public class Test {

	static String school = "EnthrallIT";
	String name;
	int age = 20;
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public Test(String n) {
		name = n;

	}
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	public void printInfo() { 
		System.out.println("School + Student Name: " + school + "_" + name);

	}
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	// Non static method can get access to static method
	
	public static void schoolName() {
		System.out.println("School's Name: " + school);
	}
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	public int addTwoNumber (int n1, int n2) {
		return n1+n2;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	public int addTwoNum (int ... n) {
		int sum=0;
		for (int s:n) {
			sum=sum+s;
		}
		return sum;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	public static void countAllDigit (int n) {
		// if I is equal to 1, and I is less than equal to nm, then  I ++
		int sum = 0;
		for (int i=1; i<=n ; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	public static void countAllDigit2 (int n) {
		// If I equal to N, I is greater than equal to 0, then i--
		int sum = 0;
		for (int i=n; i>=0 ; i--) {
			sum=sum+i;
		}
		System.out.println(sum);
	}
	// if we start from 0 we do decremental 
	// if we start from 1 we do incremental
	
	//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	public static void main(String[] args) {
		Test obj1 = new Test("Tania");
		obj1.printInfo();
		schoolName();
		obj1.addTwoNum(50);
		countAllDigit(50); //
		countAllDigit2(50);
		// obj1.name = "Tania";
		
		System.out.println(obj1.addTwoNumber(4, 3)/2);
		
		Test obj2 = new Test("Pronoy");
		// obj2.name = "Pronoy";

		System.out.println(obj1.school);
		//System.out.println(obj1.name);

		System.out.println(obj2.school);
		System.out.println(obj2.name);
//		obj1.name = "Pronoy";
//		obj2.name = "Arojit";
//		System.out.println(school + ": " + obj1.name);
//		System.out.println(school + ": " + obj2.name);

	}

//	public static int countAllNumber(int n) {
//		int sum = 0;
//		for (int i = n; i > 0; i--) {
//if (i == 50) {
//	sum ++;
//
//		}
//		}
//		return sum;

}

//new email
//ask Tofael 
//Embeded field 
