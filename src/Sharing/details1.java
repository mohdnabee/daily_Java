package Sharing;

public class details1 {
    public void hii(int price , int ram , int storage, String name  ) {
        System.out.println();
        System.out.println("new class name is Details ");
       // String name  = "Asus Tuf Gaming F15";
//        int ram =  16 ;
//        int storage = 512;
        System.out.println("Laptop :" +name );
        System.out.println("Ram: "+ ram +"GB");
        System.out.println("Storage:"+storage+"GB");
        System.out.println("Price :" +price+ "RS");
    }

    public void MobileDetails (int price, int ram ,  int Storage , int camera, String Name){
        System.out.println();
        System.out.println("Name : "+ Name);
        System.out.println("Ram : "+ ram + "GB");
        System.out.println("Storage : "+ Storage+ "GB");
        System.out.println("Back Camera : "+ camera+ "MP");
        System.out.println("Price : "+ price +" RS");
    }

}


