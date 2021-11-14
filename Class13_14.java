//父類
class Daa{
    public int num1;
    public int num2;
    public Daa(){
        num1 = 1;
        num2 = 1;
    }
    public Daa(int a,int b){
        num1 = a;
        num2 = b;
    }
}
//子類
class Dbb extends Daa{
    public Dbb(){
        //(13)
        super.num1 = 1;
        super.num2 = 1;
    }
    public Dbb(int a ,int b){
        //(14)
        super(a,b);
    }    
    public void show(){
        System.out.println("num1 = "+num1);
        System.out.println("num2 = "+num2);
    }
}
public class Class13_14{
    public static void main(String[]argv){
        Dbb bb = new Dbb();
        Dbb bbb = new Dbb(5,10);
        bb.show();
        bbb.show();
    }
}
