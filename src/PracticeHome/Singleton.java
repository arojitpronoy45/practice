package PracticeHome;

public class Singleton {
	
	public static void main(String[] args) {
		Demo imran  = Demo.createSingetone();// here
		Demo imran2  = Demo.createSingetone();// here 
		Demo imran3  = Demo.createSingetone();// here 
		Demo imran5  = Demo.createSingetone();// here 
	imran.count = 100;
	
	
		System.out.println(imran5.count);
	
		
		
		
	}

}
