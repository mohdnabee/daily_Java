package conditionalStatements.Switch;

import java.util.Scanner;

public class vowelandCons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       char vowels = sc.next().charAt(0);

       switch (vowels){

           case 'a':
           case 'e':
           case 'i':
           case 'o':
           case 'u':
               System.out.println("Vowels");
               break;
           case 'A':
           case 'E':
           case 'I':
           case 'O':
           case 'U':
               System.out.println("  Vowels");
               break;

           default:
               System.out.println("Consonant");
               break;
       }


    }
}
