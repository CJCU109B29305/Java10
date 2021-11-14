class CRC{
    protected int length;
    protected int width;
    //(a)
    public CRC(int l,int w){
        length = l;
        width = w;
    }
    public String toString(){
        return "length = "+this.length+" width = "+this.width+" area = "+(length*width);
    }
    /* 20題 錯誤
    
    public String toString(int a,int b){
        if(a>=b){
            return toString();
        }
        else if (a<b) {
            return "Argument Error";
        }
    }
    */
}

public class Class19_20 {
    public static void main(String []argv){
        //(b)
        CRC rect = new CRC(2,6);
        System.out.println(rect);
    }
}
