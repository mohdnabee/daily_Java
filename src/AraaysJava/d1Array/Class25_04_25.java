package AraaysJava.d1Array;

public class Class25_04_25 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 5,};

        int n = arr.length + 1; // assuming one element is missing
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        int missingValue = expectedSum - actualSum;
        System.out.println("Missing value: " + missingValue);
    }

}

/**
 * dry run code    n = arr.length +1 =  4+1 = 5
 *          expected sum  =  n * (n+1)/2 =  5 *(5+1)/2 =  30 /2 = 15
 *      int missingValue = expectedSum - actualSum =  15 - 1-2 -3 -4 -5
 */