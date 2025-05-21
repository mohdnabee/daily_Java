package InterFaceJava;

interface  Client{
    void PrintBill();
    void Show();
}

class  dev implements Client{
    public  void PrintBill(){
        System.out.println("Print the bill");
    }
    public void  Show(){
        System.out.println("Show the bills ");
    }

}


public class bill {
    public static void main(String[] args) {
        dev obj =  new dev();
        obj.PrintBill();
        obj.Show();

    }


}
