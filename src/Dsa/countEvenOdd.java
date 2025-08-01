package Dsa;

public class countEvenOdd {
    public static void main(String[] args) {

        int[] array  =  {1,2,3,4};
        int eventCount =  0;
        int oddCount =  0 ;

        for (int num : array){
            if (num %2 == 0){
                eventCount++;
            }else {
                oddCount ++;
            }
        }

        System.out.println("Even: "+eventCount);
        System.out.println("Odd: "+oddCount);

    }
}
