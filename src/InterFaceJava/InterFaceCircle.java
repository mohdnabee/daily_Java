package InterFaceJava;

/// Create an interface Shape with a method area().
/// Then, create a class Circle that implements Shape and calculates the area using radius = 5.
/// Print the area in the main method.

interface  shape {
    void area ();
}

class  circle implements shape {
    public void area (){
        double r =  5.0 ;
        double AreaCircle =  2 * 3.14 *  r  ;

        System.out.println(" Area Of A Circle Is :"+ AreaCircle);
    }
}

public class InterFaceCircle {
    public static void main(String[] args) {

        circle obj = new circle();
        obj.area();
    }
}
