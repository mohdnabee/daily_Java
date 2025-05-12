package String;

public class reverse {

    public static void main(String[] args) {

//        String str =  "Nabeel";// reverse
//        for (int i =str.length()-1; i>= 0; i--){
//            System.out.println(str.charAt(i));
//        }

        String str = "eye";
        String rev = "";

        for (int i = str.length()-1; i>=0; i--){
            rev+=str.charAt(i);
        }
        System.out.println(rev);
        if (str.equals(rev)){
            System.out.println("palindrome");
        }else {
            System.out.println("not a palindrome");

        }
    }

}
