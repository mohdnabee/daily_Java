package sets;

import java.util.HashMap;

public class string {
    public static void main(String[] args) {

        String str =  "programming";
//        char []ch = str.toCharArray();
        HashMap<Character, Integer> map =  new HashMap<>();

//      for (char i : ch){
//          System.out.println(i);
//      }

       for (char ch : str.toCharArray()){
           map.put( ch , map.getOrDefault(ch,0)+1);
       }
        System.out.println(map);
    }
}
