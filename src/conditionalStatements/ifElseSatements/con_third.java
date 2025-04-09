package conditionalStatements.ifElseSatements;
import java.util.*;

public class con_third {
    public static void main (String [] args){
// using  else if

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("EQUAL");
        } else if (a>b) {
            System.out.println("a is greater");
        }else {
            System.out.println("a is lesser");
        }

    }
}
