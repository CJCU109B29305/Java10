class Ca{
    private int num;

    public Ca(int n){
        num = n;
    }
    public int get(){
        return num;
    }
}
class Cb extends Ca{
    public Cb(int n){
        super(n);//加入子建構元並呼叫父建構元
    }
    public void show(){
        System.out.println("num = "+get());
    }

}
public class Class05 {
    public static void main(String[]argv){
        Cb b = new Cb(2);//加入數值2
        b.show();
    }
}
