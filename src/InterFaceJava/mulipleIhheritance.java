package InterFaceJava;

interface A {
    void show();
}

interface  b {
    // void show();
    void PrintNew  ();
}

public class mulipleIhheritance implements  A, b {

    public  void show(){
        System.out.println("This Is common feature of A and b ");
    }

    public  void PrintNew(){
        System.out.println("Print The Data ");
    }

    public static void main(String[] args) {
        mulipleIhheritance obj = new mulipleIhheritance();
        obj.show();
        obj.PrintNew();


    }
}
