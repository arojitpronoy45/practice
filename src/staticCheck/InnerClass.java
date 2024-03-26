package staticCheck;

public class InnerClass {
		public InnerClass() {
			System.out.println("d");
		}
		public static void main(String[] args) {
			InnerClass in = new InnerClass();
			System.out.println(in);
		}
}
