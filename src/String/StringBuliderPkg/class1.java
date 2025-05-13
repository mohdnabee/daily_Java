package String.StringBuliderPkg;

public class class1 {
    public static void main(String[] args) {

        //  make a stringBulider
        StringBuilder sb =  new StringBuilder("Tony");
        System.out.println(sb);

        //  char At index (0)=> 0/p = T
        System.out.println(sb.charAt(0));

        //  set char At index (0)=> T replace by P
        sb.setCharAt(0, 'p');
        System.out.println(sb);


    }


}
