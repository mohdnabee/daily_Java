package sets;

import com.sun.jdi.Value;

import java.security.Key;
import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {


        HashMap<String, Integer> map =  new HashMap<>();
        map.put("id0", 1);// key and value ||key always unique
        map.put("id1", 2);
        map.put("id2", 3);
        map.put("id3", 4);
        System.out.println(map);


        System.out.println(map.get("id0"));
        System.out.println(map.getOrDefault("id0",0));
        System.out.println("map.keySet() "+map.keySet());
        System.out.println("map.Values() " +map.values());


        map.forEach((key, value)-> {
            System.out.println(key +value);
        });


    }
}
