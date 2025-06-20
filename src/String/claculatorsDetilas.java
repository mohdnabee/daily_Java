package String;

public class claculatorsDetilas {
    public static void main(String[] args) {

        String  calculator =   "FX-82MS";
        String brand =  "Casio" ;
        String  edition =  "2th edition";
        String display =  "2-line display";
        String year =  "08/2024";
        String accessory =  "come with slides on hard cover";

        int fun = 240;
        double price =  625.0;
        int warranty =  3 ;
        double discount =  12.0;
        double totalDis=  price * (discount /  100.0);

        System.out.println("Calculator Details :");
        System.out.println();

        System.out.println("Brand :" + brand + " "+ calculator);
        System.out.println("Edition" +edition);
        System.out.println("Functions :"+ fun);
        System.out.println("Display Type :"+ display);
        System.out.println("Manufactured Year :" +year);
        System.out.println("Accessory comes :" +accessory);
        System.out.println("Warranty :" + warranty +" years");
        System.out.println("Price : "+price);
        System.out.println("Discount :" +discount+ " % "+ totalDis);
        System.out.println("Total price : "+ price + " - "+ totalDis+ " = "+ (price - totalDis));
    }
}
