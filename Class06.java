class CTriangle{
    protected int base;
    protected int height;

    protected void show(){
        
        System.out.println("base = "+base+" height = "+height);
        
    }
}

//(a)
class CData extends CTriangle{
    //(b)
    public CData(int b,int h){
        base = b;
        height = h;
        show();
    }
    public void area(){
        System.out.println("area = "+(base*height/2.0));
    }   
}


public class Class06 {
    public static void main(String[]argv){
        //(c)
        CData obj = new CData(3,8);
        obj.area();
    }
}
