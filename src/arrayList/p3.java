package arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class p3 {
    public static void main(String[] args) {
        ArrayList<String> names =  new ArrayList<>();
        names.add("Bob");
        names.add("noob");
        names.add("Scorpion");
        names.add("Sub-zero");
        names.add("kitana");


        ListIterator<String> it  =  names.listIterator();

        while (it.hasNext()){

            String ele =  it.next();
            if (ele.length()<=4){
                it.set("byee");
            }
        }

        System.out.println(names);
        System.out.println();
        System.out.println("pree");

        int count =  0;
        while (it.hasPrevious()){
            String lastvalue =  it.previous();
            count ++;

            if (count !=  names.size()){
                it.set("hello");
            }

        }

        System.out.println(names);

    }
}
