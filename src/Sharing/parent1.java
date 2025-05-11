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


        patterns1 obj3 =  new patterns1();
        obj3.pat(6);

//        child1 obj2 =  new child1();
//        obj2.sum(3,4);

        VechileDetails obj4 =  new VechileDetails();
        obj4 .bike(150000,"Royal Enfield Hunter 350   ","2024", "Black  ");
        obj4.bike(170583,"Yamaha MT 15 V2", "2025", "black");
        obj4.bike(170583,"Yamaha R15 V4", "2025", "blue");


        obj4.car(8.69, " lakh","Maruti Brezza","2023","blue","Suv");

    }
}