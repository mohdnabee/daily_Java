package recursionJAVA;

public class PermuatationRecusrion {

    public  static  void printPerm(String str ,  String permutation){

        for (int i =0;  i<str.length();i++){
            char currChar =  str.charAt(i);
            // "abc" -> 'ab'
            String newStr =  str.substring(0,i)+str.substring(i+1); 
        }
    }

    public static void main(String[] args) {

    }
}
