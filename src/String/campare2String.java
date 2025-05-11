package String;

public class campare2String {
    public static void main(String[] args) {


        String name1 = "Tony";
        String name2 = "Tony";

        // using a .compareTo Function:
        if (name1.compareTo(name2) == 0){
            System.out.println("given string is equal");
        }else {
            System.out.println("given string are not equal ");
        }

        //  sometimes its fails ==
        if (name1 ==  name2){
            System.out.println("given string is equal");
        }else {
            System.out.println("given string are not equal ");
        }


        // ex fails condition ==  like

        if (new String("Toon")== new String("Toon")){
            System.out.println("given string is equal");
        }else {
            System.out.println("given string are not equal ");
        }

    }
}
