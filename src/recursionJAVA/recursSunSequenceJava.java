package recursionJAVA;

public class recursSunSequenceJava {
    public  static void subSequences(String str ,  int idx ,  String newString){
        if (idx == str.length()){
            System.out.println(newString);
            return;
        }

        char currcahr =  str.charAt(idx);

        //  to be choose
        subSequences(str,idx+1,newString+currcahr);



        //  or not to be
        subSequences(str,idx+1,newString);

    }

    public static void main(String[] args) {
        String str =  "abc";
        subSequences(str,0,"");
    }
}
