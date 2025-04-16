package Questions_Patterns;

public class class16_05_25 {

    public static void main(String[] args) {
        int a =  123, sum = 0;

        while (a>0){
            sum = sum + a % 10;
            a = a/10;
        }
        System.out.println(sum);


    }
}
