package ExceptionHAndling;

public class userInput2 {
    public static void main(String[] args) {
        String Str  =  null;

        try {
            System.out.println(Str.toUpperCase());
        }catch (Exception e){
            System.out.println(" Exception shows :-");
            System.out.println(e);
            System.out.println(" Your String  value is Null");
        }
        System.out.println(" example ");
    }
}
