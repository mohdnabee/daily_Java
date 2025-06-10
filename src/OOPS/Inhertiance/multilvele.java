package OOPS.Inhertiance;

///import OOPS.Bank;
///import bankpkg.*;
class Shapes{
    public  void  area (){
        System.out.println("Display area");
    }
}

class  Triangles extends shape{
    public void  area(int l , int h){
        System.out.println(1/2*l*h);
    }
}

class  equilateralTriangle extends Triangles{
    public void area (int l , int h){
        System.out.println(1/2 * l *h);
    }
}

public class multilvele {
    public static void main(String[] args) {
//Bank.Account account1 =  new Bank.Account();
// account1 = "Customer1";


    }
}
