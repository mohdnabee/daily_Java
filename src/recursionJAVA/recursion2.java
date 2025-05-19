package recursionJAVA;
/// Q.  print number from 1 to 5 :
public class recursion2 {

    public  static void printNumb(int n){

        //  base case
        if (n==6){
            return;
        }

        System.out.println(n);
        printNumb(n+1);

    }


    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }
}
