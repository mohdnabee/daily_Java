package Dsa;

public class easy_LienarSearch {
    public static void main(String[] args) {


        int[] arr = {4, 5, 7, 1, 9, 3};
        int target = 9;
        boolean found = false;

        for(int num : arr){
            if (num ==  target){
                found =  true;
                break;
            }
        }

        if (found)
            System.out.println("Element found");
        else
            System.out.println("Element  not found ");

    }
}
