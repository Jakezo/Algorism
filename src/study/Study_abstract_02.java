package study;

abstract class Animal {
	// field
    public String kind;
     
    // constructor
    public Animal(String kind) {
		super();
		this.kind = kind;
	}
    // method ]
    // 일반 메소드
	public void breath(){
        System.out.println("동물의 종류는" + kind);
    }
	
    //추상메서드
    public abstract void sound();//구체적인 구현부는 없음!
}

	class Dog extends Animal{
		// field
		String bark;
		
		// constructor
		public Dog(String kind, String bark) {
			super(kind);
			this.bark = bark;
		}
		@Override
		public void sound() {
			// TODO Auto-generated method stub
			System.out.println("동물종류:" + kind);
			System.out.println("동물울음소리:" + bark);
			
		}
	}    
	
    

/*
 * class Cat extends Animal{
 * 
 * public Cat(){ this.kind = "포유류"; }
 * 
 * @Override public void sound() { // TODO Auto-generated method stub
 * System.out.println("야~옹!"); }
 * 
 * }
 */
public class Study_abstract_02 {
	public static void main(String[] args) {
		
		Dog dog = new Dog("포유류", "왈왈");
		dog.sound();
		dog.breath();
		
	}
}


