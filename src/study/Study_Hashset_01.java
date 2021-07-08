package study;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Study_Hashset_01 {
	
	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<>();
		
		Set<Integer> set2 = new HashSet<>();
		set.add("java");
		set.add("db");
		
		// 2. 순회
		
		for(String course : set)
			System.out.println(course);
		
		for (int i = 0; i <5; i++) {
			set2.add((int) (Math.random() * 10) + 1);
			
		}
		
		Iterator<Integer> itr = set2.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
	}

}
 