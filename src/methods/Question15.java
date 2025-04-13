package methods;
// 15.	Implement a method that receives a number and returns the number increased by 10.
//Sample Input: 15
//Sample Output: 25
public class Question15 {

    public  static  int increaseTen (int num){
        return  num +10;
    }

    public static void main(String[] args) {

        int number =  15 ;
        int resullt = increaseTen(number);
        System.out.println("Result : "+ resullt);
    }
}
