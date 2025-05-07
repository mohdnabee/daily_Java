package calssAndObjects.abstractClass;

abstract class DoneAbs{
    abstract  void Done (String name , int price);
    void AbsBankDetails(){
        System.out.println("Your data is loading ...");
    }
}

class AbsAccountHolder extends  DoneAbs{
    void Done(String name , int price){
        System.out.println("Account Holder name :"+ name );
    }
}

class  AbsBankBalance extends  DoneAbs {
    void Done(String name , int price){
        System.out.println("your Bank balance is : "+ price);
    }
}



public class bankAbs1 {
    public static void main(String[] args) {

        DoneAbs bank = new AbsAccountHolder();
        bank.AbsBankDetails();
        bank.Done("Mohd Nabeel", 00);

        DoneAbs bank1 = new AbsBankBalance();
        bank1.Done(" ", 52000);
        bank1.AbsBankDetails();
    }
}
