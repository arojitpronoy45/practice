package abs;

public class Demoint extends AbsT   {

	int i =0; 
	
	
	public Demoint() {
		
		super();// --> no benefit
	}
	
	public static void main(String[] args) {
		AbsT ab = new AbsT();// 
		Demoint di = new Demoint();
		System.out.println(di);
		int j = 20; // local
		
		
	}
	
	
	

	
}
