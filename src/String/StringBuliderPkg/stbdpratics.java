package String.StringBuliderPkg;

public class stbdpratics {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("hello World");

        //  use append function
        sb.append(" Java");
        sb.append(" Programming");
        System.out.println();
        System.out.println(sb);
        System.out.println("first length of String builder is : "+sb.length());

        //  use an insert function
        sb.insert(11, "!");
        System.out.println();
        System.out.println(sb);
        System.out.println("Second length of String builder is : "+sb.length());

        // repacle world is h is H using setChar At function
        sb.setCharAt(0, 'H');
        System.out.println();
        System.out.println(sb);

        //  delete function
        sb.delete(5,12);
        System.out.println();
        System.out.println(sb);
        System.out.println("Third length of String builder is : "+sb.length());


        // reverse of string

        for (int i = 0;  i<sb.length()/2; i++){
            int front =  i;
            int back =  sb.length()-1-i;

            char frontChar = sb.charAt(front);
            char backChar =  sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println();
        System.out.println("Reverse of String is : "+ sb);

    }
}
