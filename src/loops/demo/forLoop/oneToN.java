package loops.demo.forLoop;
import java.util.*;
public class oneToN {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number");
        int n = sc.nextInt();


        for (int i = 0;  i<=n; i ++){
            System.out.println(i);
        }
    }
}
