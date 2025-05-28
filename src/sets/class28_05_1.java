package sets;

import java.util.HashSet;

public class class28_05_1 {
    public static void main(String[] args) {

        //  sets are store unique value
        //  sets can not be repeats same elements


        int [] aar =  {3 , 21,  34 ,  4 , 4 , 56 ,  6 , 6 , 4};

        HashSet<Integer> set =  new HashSet<>();
        for (int i  :  aar){
            set.add(i);
        }

        System.out.println(set);
    }
}
