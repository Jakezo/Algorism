package practice;

public class pra12 {

	public static void main(String[] args) 
	{
		int[] nums = new int[100];
		
		for(int i = 1 ; i <= 100 ; i++) {
			nums[i - 1] = i;
			System.out.println("처음인트값" + i);
		}
		for(int num: nums)
		{
			if(num == 2)
				System.out.println(num);
			
			else if(num %2 == 0)
				continue;
			
			else
			{
				int count = 0;
				
				for(int i = 1 ; i <= num ; i += 2) // 카운트 늘어나도 for 조건 될때까지 계속 대입된다. (i <= num 까지) 2씩 더한이유도 어짜피 홀수로 나눠야함 .. 짝수는 2의 배수라서
				{
					if(num %i == 0)
						count++;
					System.out.println("넘값 " +num);
					System.out.println("인트값:" + i);
					System.out.println("카운트 "+count);
				}
				
				if(count == 2)  // 카운트가 2로 끝났을때는 (카운트별로 나눴을때 0이 되는게 계산된다) 2면 자기자신과 1만 나눠진다는 뜻임.
					System.out.println("소수:"+num);
			}
		}
	}

}
