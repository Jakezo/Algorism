package study;

public class Study_IndexOf_01 {
	public static void main(String[] args) {
			 String indexOfTestOne = "Hello world"; 
			 String indexOfTestTwo = "   Hello world  "; 
			 System.out.println( indexOfTestOne.indexOf("o") ); // 4 
			 System.out.println( indexOfTestOne.indexOf("x") ); // -1 
			 System.out.println( indexOfTestOne.indexOf("o",5) ); // 7 
			 System.out.println( indexOfTestTwo.indexOf("o") ); //
			 System.out.println( indexOfTestTwo.indexOf("el") ); //
			 
			 System.out.println( indexOfTestOne.lastIndexOf("o") ); // 7 
			 System.out.println( indexOfTestOne.lastIndexOf("x") ); // -1 
			 System.out.println( indexOfTestOne.lastIndexOf("o",5) ); // 

	}
	

}
