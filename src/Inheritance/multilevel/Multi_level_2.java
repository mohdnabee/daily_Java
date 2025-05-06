package Inheritance.multilevel;

//  MultiLevel Inheritance ===========================//============================//==================================

class Device{
    void powerOn(){
        System.out.println("Device power is On");
    }
}
class Laptop extends Device{
    void boot(){
        System.out.println("Laptop is Booting");
    }
}
class gameingLaptop extends Laptop{
    void startGame(){
        System.out.println("Game is ONN");
    }
}
public class Multi_level_2 {
    public static void main(String[] args) {
        gameingLaptop obj = new gameingLaptop();
        obj.powerOn();
        obj.boot();
        obj.startGame();
    }
}
