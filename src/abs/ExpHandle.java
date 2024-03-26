package abs;

public class ExpHandle {
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		try {
			int i = 10/0;
//			Thread.sleep(10);
			
		}catch(ArithmeticException e) {
			// error deal
			System.out.println("error found");
			
		}finally {
			System.out.println("all the time will execute");
		}
	}

}
