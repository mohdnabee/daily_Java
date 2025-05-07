package calssAndObjects.abstractClass;

abstract  class  AbsMethodPro {
    abstract  void  calculator (int a ,  int b );
}

class  AbsMulti extends AbsMethodPro{
    void calculator (int a , int b){
        System.out.println("product of "+a+" * "+ b +" = "+(a*b));
    }
}

class  AbsAdd extends AbsMethodPro{
    void calculator (int a , int b){
        System.out.println("Sum of "+ a + " + "+ b + " =  "+(a+b));
    }
}

class AbsSubtraction extends  AbsMethodPro{
    void calculator (int a , int b){
        System.out.println("Subtraction of "+ a + " - "+ b + " = "+(a-b));
    }
}

public class abs3 {
    public static void main(String[] args) {
        System.out.println("Date : 07-05-2025");
        System.out.println("Example of Abstract class .....");

        AbsMethodPro obj = new AbsMulti();
        obj.calculator(2,4);

        AbsMethodPro obj1 = new AbsAdd();
        obj1.calculator(10, 5);

        AbsMethodPro obj2 = new AbsSubtraction();
        obj2.calculator(20,13);


    }

}
