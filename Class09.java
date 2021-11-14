class Cca{
    private int num;
    public Cca(){
        //給空白的輸入使用(c)
    }
    public Cca(int n){
        num = n;
    }
    public int get(){
        return num;
    }
    //(a)
    public void display(){
        System.out.println("printed from Cca class");
    }
}
class Ccb extends Cca{
    public Ccb(){
        //給空白的輸入使用(c)
    }
    public Ccb(int n){
        super(n);
    }
    public void show(){
        System.out.println("num = "+get());
    }
    //(b)
    public void display(){
        System.out.println("printed from Ccb class");
    }
}
public class Class09 {
    public static void main(String[]argv){
        Ccb b = new Ccb(2);
        b.show();
        //(c) 都是子類別被呼叫
        Cca bb = new Ccb();
        b.display();
        bb.display();
    }
}
