package recursionJAVA;
/// Q.  print number from 5 to 1 :
public class recursion1 {
    public static void printNumber(int n ){

        if (n ==0 ){//  base case
            return;
        }
        System.out.print(n+ " ");
        printNumber(n-1);
    }

    public static void main(String[] args) {
        int n =  5 ;
        printNumber(n);
    }
}
