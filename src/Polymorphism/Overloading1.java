package Polymorphism;


//  method overloading

class  parent {

    void sum (int a ){
        System.out.println("The value of a is : "+a);
    }

    void sum (int a ,int b){
        System.out.println("Sum of a and b is: "+ a+b);
    }

    void sum (int a ,int b , int c){
        System.out.println("Sum of a , b and c is: "+(a+b+c));
    }

    // using a double
    void sum (double a , double b){
        System.out.println("Sum of double a+b is: "+a+b);
    }
}


public class Overloading1 {
    public static void main(String[] args) {
        parent obj =  new parent();
        obj.sum(20);
        obj.sum(12,18);
        obj.sum(10,20,30);
        obj.sum(3.14,5.6);

    }
}
