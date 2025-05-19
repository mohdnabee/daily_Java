package recursionJAVA;
///   print sum of first n natural numbers
public class recursion3 {

    public static  void pintSum(int i, int n , int sum){

        if (i == n){
            sum += i ;
            System.out.println(sum);
            return;
        }

      sum += i;
        pintSum(i+1,n,sum);
       // System.out.println(i);

    }

    public static void main(String[] args) {

        pintSum(1 ,5 ,0);

    }
}
