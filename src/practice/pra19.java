package practice;

class Coco{
    private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
 
   // Coco(){}
    	
    Coco(String modelName, int modelYear, String color, int maxSpeed){    // ①
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
 
    public String getModel(){
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}
 
public class pra19{
    public static void main(String[] args) {
       //  Coco myCoco = new Coco();                                    // ② 기본 생성자 호출 Coco 클래스에  Coco(){} 이게 있거나 Coco 안에 매개변수 있는게 있어야함
         Coco myCoco = new Coco("아반떼", 2016, "흰색", 200);     // ③ 생성자의 호출 
 
        System.out.println(myCoco.getModel());                    // 생성자에 의해 초기화 되었는지 확인
    }
}
