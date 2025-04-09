package conditionalStatements.ifElseSatements;
import java.util.*;

public class conditional_second {

    //  using a if else

// take a two numbers from user a and b
    // condtions
    // 1) a =b  = equal, 2) a>b a is greater , 3) a< b a is lesser
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b){
            System.out.println("Equal");
        }else {
            if (a>b){
                System.out.println("a is greater");
            }
            else {
                System.out.println("a is lesser ");
            }
        }

    }

}
