package OOPS;

class  Pen {
    String color ;
    String type ;  ///  ball point;  gel

    public  void write(){
        System.out.println("Writing something ");
    }

    public  void printColor(){
        // this is a java keyword
        System.out.println("Color : "+this.color);
    }

}


public class OOPS {
    public static void main(String[] args) {
        // objects
        Pen pen1 =  new Pen();
        pen1.color =  "blue";
        pen1.type= "ballpoint";

        Pen pen2 =  new Pen();
        pen2.color= "black";
        pen2.type= "Gel";

        pen1.printColor();
        pen2.printColor();
//        pen1.write();

    }

}
