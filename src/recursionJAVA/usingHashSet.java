package recursionJAVA;

import java.util.HashSet;

public class usingHashSet {

    public  static void subSequences(String str ,  int idx ,  String newString,  HashSet<String>set) {
        if (idx == str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        char currcahr =  str.charAt(idx);

        //  to be choose
        subSequences(str,idx+1,newString+currcahr,set);



        //  or not to be
        subSequences(str,idx+1,newString,set);

    }
    public static void main(String[] args) {
        String str =  "aaa";
        HashSet<String> set = new HashSet<>();
        subSequences(str,0,"",set);
    }
}
