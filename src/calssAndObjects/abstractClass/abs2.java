package calssAndObjects.abstractClass;

abstract  class shape{
    abstract void Area(double r , double l , double b );
    void Method(){
        System.out.println("=========//==============//======");
    }
}

class CircleAbs extends shape{
    void Area (double r , double l, double b){
        double a = 3.14 * r *r;
        System.out.println("Area of circle is : "+a);
    }
}

class RectangleAbs extends shape{
    void Area(double r, double l ,double b){
        double a =  l * b;
        System.out.println("Area of rectangle is : "+a);
    }
}


public class abs2 {
    public static void main(String[] args) {

        shape obj = new CircleAbs();
        obj.Area(3,0,0);
        obj.Method();

        shape obj1 = new RectangleAbs();
        obj1.Area(0,2,4);
        obj1.Method();
    }
}
