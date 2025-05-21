package InterFaceJava;

/// Create two interfaces A and B. Both interfaces should have a method named display().
/// Then, create a class Demo that implements both interfaces.
/// Implement the display() method and call it in the main method using a Demo object.


interface  CA {
  void display();
}
interface  CB{
    void display();
}
class  demo implements CA, CB{
  public  void display(){
      System.out.println(" Implement the display() method and call it in the main method using a Demo object. ");
  }
}
public class Interfac2Class {
    public static void main(String[] args) {

        demo CACB =  new demo();
        CACB.display();

    }
}
