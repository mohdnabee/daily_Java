package String.StringBuliderPkg;

public class appendStrbd {
    public static void main(String[] args) {
        //  using a append function

        StringBuilder sb =  new StringBuilder("N");

        sb.append("a");
        sb.append("b");
        sb.append("e");
        sb.append("e");
        sb.append("l");

        System.out.println(sb);

        //  length of String Builder is 6
        System.out.println(sb.length());

    }
}
