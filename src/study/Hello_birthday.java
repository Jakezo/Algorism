package study;

import java.util.Scanner;

public class Hello_birthday {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        System.out.print("하나의 정수를 입력하세요: ");
        int num = scanner.nextInt(); //하나의 정수 입력
            
            while(true) {
                if(num%2 == 0 && num%3 == 0) { // 2와 3의 공배수일때를 지정
                    System.out.println(num +"은" + "2와 3의 배수입니다.");
                    System.out.println("프로그램 종료!");
                    break; //이 상황에서 프로그램을 종료하겠다는 break문
                }
            
                System.out.println(num +"은" + "2와 3의 배수가 아닙니다."); 
                System.out.print("하나의 정수를 입력하세요: "); //아니면 또 계속 무한으로 이 문구가 나와야하기 때문에 다시 입력창을 설정해줌.
                num = scanner.nextInt(); //하나의 정수 입력
            }
            
        scanner.close();
        
    }

}
