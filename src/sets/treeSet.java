package sets;

import java.util.HashSet;
import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        int [] aar =  {3 , 21,  34 ,  4 , 4 , 56 ,  6 , 6 , 4};

        TreeSet<Integer> set =  new TreeSet<>();
        for (int i  :  aar){
            set.add(i);
        }

        System.out.println(set);
    }
}
///  tree set are used to remove same elements and make the sorted array