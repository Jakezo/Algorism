package practice;

class Car3{
    private String modelName = "소나타";
    private int modelYear = 2016;
    private String color = "파란색";
 
    public String getModel(){
        return this.modelYear + "년식 " + this.color + " " + this.modelName;
    }
}

 
public class pra18{
    public static void main(String[] args) {
        Car3 myCar = new Car3();                    // 기본 생성자 호출
        System.out.println(myCar.getModel());    // 2016식 파란색 소나타
    }
}
