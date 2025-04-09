package conditionalStatements;

import java.util.*;

public class Switch_con {
    public static void main(String [] args) {
        // using a  else if
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

//        if (button == 1) {
//            System.out.println("hello");
//        } else if (button == 2) {
//            System.out.println("Good morning");
//        } else if (button == 3) {
//            System.out.println("Good night");
//        } else {
//            System.out.println("invalid Button");
//        }

        // Switch statement


        switch (button){
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
        }

    }
}
