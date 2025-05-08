package Sharing;

public class parent1 {
    public static void main(String[] args) {

        child1 obj = new child1();
        obj.hello();

        obj.details("Mohd Nabeel", "0246CS243D13");


        //  call a new class details
        details1 obj1 = new details1();
        obj1.hii(64000, 16, 512, "ASUS TUF GAMING F15");
        obj1.MobileDetails(18000, 6,128,108, "Realme 8 Pro");

        operation1 obj2  = new operation1();
        obj2.opera(5, 4);

//        child1 obj2 =  new child1();
//        obj2.sum(3,4);
    }
}
