package ExceptionHAndling;

public class stringError {
    public static void main(String[] args) {

        String str =  null;

        try {
            System.out.println(str.length());
        }catch (Exception e ){
            System.out.println("Exception Error : "+ e);
        }

        System.out.println(" example ");


    }
}
