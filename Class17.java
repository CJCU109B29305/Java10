class Car {
    protected String owner;
    protected String id;
//(e)final父類終止繼承 無法複寫
    final void show(){
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
    }
    //(a)
    public Car(String own,String s){
        owner = own;
        id = s;
    }
}
//(b)
class CColor extends Car{
    private String color;
    //(c)
    public CColor(String own,String s,String col){
        super(own,s);
        color = col;
    }
    //(d)
    public void show1(){
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
        System.out.println("車身顏色:"+color);
    }
}
public class Class17 {
    public static void main(String[]argv){
        CColor mycar = new CColor("Riaan","A1-2345","Black");
        mycar.show1();
    }
}
