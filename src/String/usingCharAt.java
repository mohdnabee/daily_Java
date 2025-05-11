package String;

public class usingCharAt {
    public static void main(String[] args) {

      //  charAt are used to travel a single-single string to print

        String name =  "Mohd "+ "Nabeel";

        //  using charAt

        for (int i =0 ; i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        String senctence = "My Name is MOhd Nabeel"+ ". How are you";

        for (int i =0 ; i<senctence.length();i++){
            System.out.print(senctence.charAt(i)+ " ");
        }

    }
}
