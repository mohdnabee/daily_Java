package arrayList;

import java.util.ArrayList;
import java.util.ListIterator;

public class p2 {
    public static void main(String[] args) {

        ArrayList<String> names =   new ArrayList<>();
        names.add("Nabeel");
        names.add("Tushar");
        names.add("Amit");
        names.add("Siddharth");
        names.add("ketan");

        ListIterator<String> it  =  names.listIterator();
        while (it.hasNext()){
            String ele =  it.next();
            System.out.println(ele);
        }
        System.out.println();
        System.out.println("pree");
        while (it.hasPrevious()){
            String lastvalue =  it.previous();
            System.out.println(lastvalue);
        }

    }
}
