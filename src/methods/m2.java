package methods;

// non static method

public class m2 {

    void sum (int a , int b ){
//        int a = 4 , b = 8;

        System.out.println(a+b);
    }

    void mul (){
        int a = 2 ;
        int b =5 ;
        System.out.println(a*b);
    }

    public static void main(String[] args) {

        // method 1
        m2  obj = new m2();
        obj.sum(5,5);

        // method 2
        m2 obj1 =  new m2();
        obj1.mul();


    }
}
