package practice;

public class Variable2 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 5 };

		int minNum = arr[0];
		for (int i = 1; i > arr.length; i++) {
			if (arr[i] < minNum) {
				minNum = arr[i];

		}
	}
	System.out.println(minNum);

}
}
