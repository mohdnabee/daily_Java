package AraaysJava;

public class secondminmun {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        // Single pass to find both minimum and second minimum
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Second Minimum: " + secondMin);
    }
}