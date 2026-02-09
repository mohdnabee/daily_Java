package Fb2026.Day2;

import java.util.Scanner;

public class SwitchState {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();

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


/**
 * switch (variable){
 *     case 1:
 *     stt1;
 *     break:
 *      case 2:
 *     stt2;
 *      break:
 *   case 3:
 *       stt2;
 *       break:
 * }
 */
