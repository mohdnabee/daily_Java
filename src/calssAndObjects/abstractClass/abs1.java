package calssAndObjects.abstractClass;

abstract class  Payment {
   abstract void pay(int a);
   void success(){
       System.out.println("payment done ....");
   }
}

class upi extends Payment{
    void pay (int a){
        System.out.println("pay via Upi"+a);
    }
}

class NetBanking extends Payment{
    void pay (int b){
        System.out.println("pay via net banking");
    }
}

public class abs1 {
    public static void main(String[] args) {

        Payment obj = new upi();
        obj.pay(5000);
        obj.success();
        Payment obj1 = new NetBanking();
        obj1.pay(7000);
        obj1.success();

    }
}
