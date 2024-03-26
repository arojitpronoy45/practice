package staticCheck;

public class OuterClass  {
	
	public OuterClass() {
		//super();
		System.out.println("constructor called");
	}
	
	
	
	public static void main(String[] args) {
		
		OuterClass outer = new OuterClass();
		System.out.println(outer);
		
//		OuterClass outerObj = new OuterClass();
//		OuterClass.
	}
}
