class CShape {
    protected int x;
    protected int y;

    public double area() {
        return 0.0;

    }
}
// (a)
class CCirle extends CShape {
    public CCirle(int x) {
        this.x = x;
    }

    public double area() {
        return (x * x * 3.14) / 1.0;

    }
}

// (b)
class CSquare extends CShape {
    public CSquare(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double area() {
        return x * y;
    }
}

// (c)
class CTriangle2 extends CShape {
    public CTriangle2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double area() {
        return x * y / 2.0;
    }
}

public class Class11_12 {
    public static void main(String[] arvg) {
        // (d)
        CShape sh[] = new CShape[6];
        sh[0] = new CCirle(1);
        sh[1] = new CCirle(2);
        sh[2] = new CSquare(1, 3);
        sh[3] = new CSquare(2, 4);
        sh[4] = new CTriangle2(1, 3);
        sh[5] = new CTriangle2(2, 4);
        for (int i = 0; i < sh.length; i++) {
            System.out.println("area of sh[" + i + "] = " + sh[i].area());
        }
        System.out.println("The largest area is " + largest(sh));
    }
    // (e)很難
    public static double largest(CShape a[]) {
        double max = a[0].area();
        for (int i = 0; i < a.length; i++) {
            if (max < a[i].area()) {
                max = a[i].area();
            }
        }
        return max;
    }
}
