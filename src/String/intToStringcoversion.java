package String;

public class intToStringcoversion {
    public static void main(String[] args) {

        // ParseInt Method => string to int conversion

        String str = "123";
        int number =  Integer.parseInt(str);
        System.out.println("string to int conversion: "+number);


        //ToString Method => int to string conversion

        int num = 1460;
        String str1=  Integer.toString(num);
        System.out.println("int to string conversion: "+str1);
        System.out.println("length of a String is: "+str1.length());

    }
}
