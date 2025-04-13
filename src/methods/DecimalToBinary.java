package methods;

import java.util.Scanner;

public class DecimalToBinary {
    public static void decimalToBinary() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");

        int decimal = scanner.nextInt();
        String binary = Integer.toBinaryString(decimal);

        System.out.println("The binary representation of " + decimal + " is: " + binary);
        scanner.close();
    }

    public static void main(String[] args) {
        decimalToBinary();
    }
}


