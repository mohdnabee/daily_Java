package methods;

// static method

public class m1 {

    static  void sum (){
        int a = 4 ,  b = 5;
        System.out.println(a+b);
    }

    static void mul (){
        int num1 = 4, num2 = 5;
        System.out.println(num1*num2);
    }

    static void reverse() {
        int num = 3408 ;
        while (num>0){
            System.out.print(num%10);
            num=num/10;
        }
    }

    public static void main(String[] args) {
        sum();
        mul();
        reverse();

    }
}
