package AraaysJava.d1Array;
//
public class Class22_04_25 {
    public static void main(String[] args) {
//  marge 2 question s
        int[] arr1 = {1, 3,5};
        int[] arr2 = {2, 4,8 };
        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        System.out.print("Merged array: ");
        for (int val : merged) {
            System.out.print(val + " ");
        }

    }
}
