package practice;

import java.util.Arrays;

public class pra21 {

	public static void main(String[] args) {
		
		StringBuffer minPrice = new StringBuffer();
		StringBuffer minLast = new StringBuffer();
		int[] Minnums = new int[5];
		for(int z=0; z < 5; z++) {
			minPrice.append(" " + z);
			String[] strArr = minPrice.toString().split(" ");
			Minnums[z] = Integer.parseInt(strArr[z+1]);
			System.out.println(Minnums[z]);
			
		}
		Arrays.sort(Minnums);
		
		System.out.println(Minnums[2]);
		
		System.out.println(minPrice);
		minLast.append(Minnums[0]);
		System.out.println(minLast);
	}

}
