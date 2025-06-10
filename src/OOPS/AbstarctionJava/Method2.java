package OOPS.AbstarctionJava;
///   interface method 2 of Abstraction
///   Interface are also used of multiple Inheritance
interface  Animals{
    int eyes =  2;
   void walk();
}

interface  herbivores{

}

class HOrse implements Animals, herbivores{//  multiple inheritance
   public void walk(){
        System.out.println("walks on 4 legs");
    }
}


public class Method2 {
    public static void main(String[] args) {

        HOrse hOrse =  new HOrse();
        hOrse.walk();

    }
}
