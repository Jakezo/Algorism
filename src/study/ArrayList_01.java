package study;

import java.util.ArrayList;

public class ArrayList_01 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<>();
		
		iList.add(10);
		iList.add(new Integer(20));
		iList.add(new Integer("30"));
		
		System.out.println("크기 :" +iList.size());
		
		System.out.println("첫번째 요소" + iList.get(0));
		
		System.out.println("마지막 요소: " + iList.get(iList.size()- 1));
		
		for(int i= 0; i < iList.size(); i++) {
			System.out.println((i+1)+"번째요소:" + iList.get(i));
		}
		
		System.out.println(iList);
		
		iList.remove(0);
		
		if(iList.contains(new Integer(33))) {
			
			
		}
			
		
		System.out.println(iList);
		
	}

}
