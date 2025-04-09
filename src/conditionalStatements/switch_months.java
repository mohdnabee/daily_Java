package conditionalStatements;

import java.util.*;
public class switch_months {
    public  static  void  main (String [] args){

        // using a switch statement to print jan to dec

        Scanner sc = new Scanner(System.in);
        int mont= sc.nextInt();

        switch (mont){
            case 1:
                System.out.println("Jan ");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("March");
                break;

            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;

            case 7:
                System.out.println("July");
                break;

            case 8:
                System.out.println("Agu");
                break;

            case 9:
                System.out.println("");
                break;
            case 10:
                System.out.println("");
                break;
            case 11:
                System.out.println("");
                break;
            case 12:
                    System.out.println("");
                    break;
            default:
                System.out.println("Invalid");

        }

    }
}
