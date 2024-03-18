package PracticeHome;

public class Demo {

	
	static int  count = 0;
    static Demo singleClass;// new object crated from method
    static boolean ifCreated = false;
	private Demo() {
		System.out.println("const called");
	}
	
	
	public static Demo createSingetone() {
		
		
		if(ifCreated == false) {
			singleClass = new Demo();
			count++;
			ifCreated = true;
			
		}
		return singleClass;
	}
	
	
	
}