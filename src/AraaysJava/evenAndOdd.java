package AraaysJava;
//  find an even and odd number in an array

public class evenAndOdd {

    public static void main(String[] args) {

        int [] arr = {1,25,33,4,50,6,70};
        int even = 0;
        int odd = 0;

        for (int i = 0; i<arr.length; i++){
            if (arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("even"+" " +even+" "+"odd" + " "+odd);

    }
}
