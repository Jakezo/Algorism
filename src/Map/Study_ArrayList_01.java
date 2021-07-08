package Map;

import java.util.ArrayList;

public class Study_ArrayList_01 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> iList = new ArrayList<>();
		
		iList.add(11);
		iList.add(new Integer(20));
		iList.add(new Integer("30"));
		
		System.out.println("첫 번째 요소 " + iList.get(0));
		
		System.out.println("마지막 요소" + iList.get(iList.size()-1));
		
		
		for(int i = 0, size= iList.size(); i < size; i++)
			System.out.println((i+1)+"번째 요소:" + iList.get(i));
		
		System.out.println("==========================");
	
		iList.remove(0);  // 첫 번째 요소 삭제(인덱스 0), 삭제 된 값을 return
		System.out.println(iList.get(0));	// 삭제된 자리 뒤의 요소들이 앞 당겨져 빈 자리를 메꾼다.
		// 7. 검색 : contains() 메소드
				if (iList.contains(new Integer(30)))	// iList에 30이 있는가?
					System.out.println("30이 있다.");
				
				// 8. 출력 
				System.out.println(iList); //[ , , , .]
				
				// 9. 초기화 (모두 삭제)
				iList.clear();
				System.out.println(iList);	// []
	}

}
