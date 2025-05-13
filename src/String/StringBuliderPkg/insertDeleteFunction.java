package String.StringBuliderPkg;

public class insertDeleteFunction {
    public static void main(String[] args) {

    StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);


    // insert function ==  insert s =  stony
        sb.insert(0,'S');
        System.out.println(sb);

        sb.insert(3,"n");
        System.out.println(sb);//  output STonny

        // delete function
        //  delete the extra 'n'
//        sb.delete(3,4);
       // System.out.println(sb);// output > STony

        // delete all n
        sb.delete(3,5);
        System.out.println(sb);// output > SToy


    }

}
