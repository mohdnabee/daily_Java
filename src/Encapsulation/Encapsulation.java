package Encapsulation;
public class Encapsulation {

    public static void main(String[] args) {

        Encapsulation obj =  new Encapsulation();
        obj.setad("enter your addres ");
        System.out.println(obj.getad());

        prson myObj = new prson();
        myObj.setName("John"); // Set the value of the name variable to "John"
        System.out.println(myObj.getName());
    }


    private String ad ; // private = restricted access

    // Getter
    public String getad() {
        return ad;
    }

    // Setter
    public void setad(String newAd) {
        this.ad= newAd;
    }
}
