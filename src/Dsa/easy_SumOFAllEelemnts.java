package Dsa;

public class easy_SumOFAllEelemnts {
    public static void main(String[] args) {

        int [] arr = {5,10,20,15};
        int sum  =0 ;

        for (int num : arr){
            sum +=  num;
        }

        System.out.println("Sum :"+ sum);
    }
}
