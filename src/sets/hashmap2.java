package sets;

import java.util.HashMap;

public class hashmap2 {
    public static void main(String[] args) {
        String str =  "Java is programming and programing is java ";

        String [] newStr = str.split(" ");
        HashMap<String, Integer> map =  new HashMap<>();

        for (String ch : newStr){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }
        System.out.println(map);
    }
}
