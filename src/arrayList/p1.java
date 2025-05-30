package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class p1 {
    public static void main(String[] args) {

        ArrayList<String> names =   new ArrayList<>();
        names.add("Nabeel");
        names.add("Tushar");
        names.add("Amit");
        names.add("Siddharth");
        names.add("ketan");
        // System.out.println(names);

        Iterator<String> it =  names.iterator();
      //   System.out.println(it.hasNext());//  gives a true or false |  shows a next value ha ki nhi ha

        while (it.hasNext()){
            String elem=  it.next();
            System.out.println(elem);//  print all names
            if (elem.startsWith("A")){
                it.remove();
            }
        }

        System.out.println();
        System.out.println("remove the (A)  letters names");

        System.out.println(names);


    }
}
