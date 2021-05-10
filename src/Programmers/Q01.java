package Programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {
	
	public static void main(String[] args) {
		
		int [] example = {1,2,3,4,5};
		int [] example2 = {1,3,2,4,2};
		
		 int[] answer = solution(example);
	      int[] answer2 = solution(example2);
	      
	      System.out.println(Arrays.toString(answer));
	      System.out.println(Arrays.toString(answer2));
		
	}
	
	 
	    private static int[] solution(int[] answers) {
	        
	        // 수포자의 찍기
	        int [] st1 = {1,2,3,4,5}; 
	        int [] st2 = {2,1,2,3,2,4,2,5};
	        int [] st3 = {3,3,1,1,2,2,4,4,5,5}; 
	        
	        int [] sol = new int [3]; //3명의 학생이므로 정답을 체크하기 위한 배열 sol 생성 
	        
	        
	        // 정답과 찍은답과 비교하여 동일한 경우 sol ++ 
	        for (int i = 0; i<answers.length; i++) {
	            if (answers[i]==st1[i%st1.length]){
	                sol[0]++;
	            }
	            if (answers[i]==st2[i%st2.length]){
	                sol[1]++;
	            }
	            if (answers[i]==st3[i%st3.length]){
	                sol[2]++;
	            }    
	        }
	        
	       // 최대값 산정
	        int max = 0;
	        for (int i=0; i<sol.length; i++){
	            if (sol[i] > max){
	                sol[i] = max;
	            }
	        }
	        if (max == 0) {  // 최대값 0 이면 아무도 못맞춤
				return new int[] {};
			}
	        
	        
	        
	        List<Integer> win = new ArrayList<>(); // 가장 높은 점수를 받은 학생 List 생성
	        // sol 배열과 가장 높은 점수를 비교하여 동일한 경우 win List에 추가 
	        for (int i=0; i<sol.length; i++){
	            if (sol[i] == max){
	                win.add(i);
	            }
	        }
	        
	         // 출력값  
	       int[] answer = new int [win.size()]; // 출력값은 win List에 추가된 학생 수와 동일하도록 길이 조정
	        
	        // 출력할 배열 answer에 List에 있는 학생번호 입력 
	        for (int i=0; i<win.size();i++){
	            answer[i]=win.get(i)+1; //index가 0부터 시작하므로 1씩 더해줌 
	        }     
	        
	        return answer;
	    }
	}



