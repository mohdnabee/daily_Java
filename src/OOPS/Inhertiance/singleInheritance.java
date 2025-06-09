package OOPS.Inhertiance;


class  shape{
    String color;
}

class  Triangle extends  shape{

}

public class singleInheritance {
    public static void main(String[] args) {
        Triangle t1 =  new Triangle();
        t1.color= "blue";
    }
}
