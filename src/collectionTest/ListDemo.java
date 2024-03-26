package collectionTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListDemo {
	
	
	public static void main(String[] args) {
		
		
		
		StringBuilder pronoy = new StringBuilder("sarker");
		StringBuffer pronoy2 = new StringBuffer("sarkar");
	
		
//		System.out.println(pronoy.reverse());
//		System.out.println(pronoy.indexOf("r"));
		String name = "T,a,n,i,a"; 
		
		String[] arr = name.split(","); // T,a,n,ia -- 5

		String result = "";// ""+Tan+ia --> Tania
		for(String temp: arr) {
			result+= temp;
		}
		
		
	 Arrays.asList(arr).forEach(System.out::println);;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(Arrays.asList(arr));
//		System.out.println(arr);
//		System.out.println(arr.length);
		
		for(int i =0; i < arr.length;i++) {
//			result= result.concat(arr[i]);
			result += arr[i];
		}
//		System.out.println(result);
		
		//labda --> 
		
		
		
		
		
		
		
		
		List<Integer> li = new ArrayList<Integer>();
		int i = 0; 
		String ss = "imran "; 
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(10);
		li.add(500);
		li.add(10);
		li.add(10);
		li.add(11);
		
		
		Set<Integer> st = new HashSet<>();
		st.add(10);
		st.add(11);
		st.add(10);
		st.add(100);
		st.add(500);
		st.add(11);
//		add
//		size
//		System.out.println(li.size());
//		li.remove(4);
//		System.out.println(li);
//		remove
//		get
//		for(int i =0; i < li.size();i++) {
//			System.out.println(li.get(i));
//		}
		
		//i am back
		
		Iterator<Integer> it = li.listIterator(); // copy of li
		Iterator<Integer> sti = st.iterator(); // copy of li
//		
		while(it.hasNext()) {
//			it.remove();
//			System.out.println(it);
			
			
		}
		
//	next(), hasNext(), remove(), add(), previous(),  hasPrevious(), previousIndex(), nextIndex(), set().
//		while(sti.hasNext()) {
//	
//			
//			// a;ldskfj;alsdkfj
//			System.out.println(sti.next());
//		}
		
		
	}

}
