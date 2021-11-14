//父類
class Caa{
    public int num1;
    public int num2;
    //(a)
    public Caa(){
        num1 = 1;
        num2 = 1;
    }
    //(b)
    public Caa(int a,int b){
        num1 = a;
        num2 = b;
    }
}
//子類
class Cbb extends Caa{
    public Cbb(){
        //讓空白的物件可以存取
    }
    //(c)
    public Cbb(int a ,int b){
        super(a,b);
    }    
    public void show(){
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
public class Class03{
    public static void main(String[]argv){
        Cbb bb = new Cbb();
        Cbb bbb = new Cbb(5,10);
        bb.show();
        bbb.show();
    }
}