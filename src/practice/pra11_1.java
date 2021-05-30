package practice;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class pra11_1 {
	  static BufferedReader br;
	  
	    public static void main(String[] args) throws Exception {
	 
	       br = new BufferedReader(new InputStreamReader(System.in));
	        int TestCase = Integer.parseInt(br.readLine());
	 
	        for (int t = 0; t < TestCase; t++) {
	            int n = Integer.parseInt(br.readLine());
	            int[][] arr = new int[n+1][2];
	            // 0일때
	            if(n==0) {
	                System.out.println("1 0");
	                continue;
	            }
	            // 1일때
	            if(n==1){
	                System.out.println("0 1");
	                continue;
	            }
	            arr[0][0] = 1;
	            arr[1][1] = 1;
	            
	            for(int i=2; i<=n; i++){
	                arr[i][0] = arr[i-1][0]+arr[i-2][0];
	                arr[i][1] = arr[i-1][1]+arr[i-2][1];
	                
	            }
	 
	            System.out.println(arr[n][0]+" "+arr[n][1]);
	 
	        }
	    }

}
