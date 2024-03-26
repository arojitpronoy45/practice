package concept2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TernaryDemo {
	
	
	public static String toString(int[] abc) {
		String result ="";
		
		
		for(int i : abc) {
		
			result+= i + ",";
		}
		
		
		return result; // 5,6,7, --> how to exclude last ","
	}

	public static void main(String[] args) throws InterruptedException {
		
		int [] arr = {1,4,5,8}; //length 
//		System.out.println(arr.length);
		
		for (int i = 0; i<arr.length; i++) {
//			System.out.println(arr[i]);
		}
		//string --> length(); 
		
		List<Integer> demoArrayList = new ArrayList<>();
		
		
		demoArrayList.add(1);
		demoArrayList.add(4);
		demoArrayList.add(5);
		demoArrayList.add(8);
		
		
		// autoboxing Integer --> int
		
		
		for(int xx:demoArrayList) {
//			System.out.println(xx.getClass().getName());
//			System.out.println(xx);// first iteration -->  1
		}
		
		for (int i = 0; i< demoArrayList.size(); i++) {
//			System.out.println(demoArrayList.get(i));
		}
		
		
//		System.out.println(demoArrayList.get(2));
		
		
		List<Integer> demoLinkList = new LinkedList<>();
		demoLinkList.add(1);
		demoLinkList.add(4);
		demoLinkList.add(5);
		demoLinkList.add(8);
		
//		System.out.println(demoLinkList.get(2));
		
		
		
		
		
		
		
		
		
		
		//set
		Set<int[]> st = new HashSet<>();
		st.add(new int[] {1,2,4});
		st.add(new int[] {5,6,7});
		st.add(new int[] {8,9,10});
	
		
		Iterator<int[]> ii = st.iterator();
	
		while(ii.hasNext()) {// 2 --> still element present? --> false
			System.out.println(Arrays.toString(ii.next()));// -->  [1,2,4]
			
		}
		///
		
		
//		for (Integer n : st) {
//			if (n == 5) {
//				System.out.println(n);//
//			}else if (n == 8) {
//				System.out.println(n);//
//				
//			}else 
//			System.out.println(n);
//		}
//		System.out.println(al.get(0).toString());
		
		
		
//		st.
//		System.out.println(System.currentTimeMillis());// before
//		for(int i = 0; i < ll.size(); i++) {
//			Thread.sleep(10);
////			System.out.println(ll.get(i));
//		}
//		System.out.println(System.currentTimeMillis());// after
		
		Map<String,Integer> mp = new HashMap<>();
		
		mp.put("a", 10);
		mp.put("b", 20);
		mp.put("c", 30);
		mp.put("Imran", 0);
		
		
		// mp.keySet() --> {a,b,c,imran) ; 
		//Map.Entry<String,String> entry : gfg.entrySet()
		// Map.entry(), Map.entrySet();
		
		
//		for(int i = 0; i < mp.keySet().size(); i++) {
//			System.out.println(mp.get(mp.keySet().toArray()[i]));
//		}

		Set<String> mapKeys = mp.keySet();// returns a set --> for the map(keys only) {a,b,c,imran}
//		Set<Integer> mapValue = mp.values();
		mp.get("key");
		
		for(String key: mapKeys) {
		// enhanced for loop 
//			System.out.println(key + " " +mp.get(key));
		}

//		System.out.println(System.currentTimeMillis());// before
		
	}

	
}
