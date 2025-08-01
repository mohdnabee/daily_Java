package Dsa;

public class countDigit {
    public static void main(String[] args) {

        int number =  1234;
        int cout  =  0  ;

        while (number !=0){
            number =  number / 10  ;
            cout ++ ;
        }

        System.out.println("Total  digit : "+cout);
    }
}
