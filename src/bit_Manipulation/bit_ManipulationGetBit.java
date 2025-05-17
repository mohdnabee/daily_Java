package bit_Manipulation;

public class bit_ManipulationGetBit {
    public static void main(String[] args) {
        int n= 5 ;//  0101
        int pos = 3;
        int bitMass=  1<<pos;

        if((bitMass & n)==  0){
            System.out.println("Bit Was zero");
        } else {
            System.out.println("bit was one ");
        }
    }
}
