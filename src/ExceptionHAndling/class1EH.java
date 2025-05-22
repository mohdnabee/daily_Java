package ExceptionHAndling;

public class class1EH {
    public static void main(String[] args) {
         int a = 10 ,  b=  0 ;

         try {
             int c =  a / b ;
             System.out.println(c);
         }
         catch (Exception e){
             System.out.println(e);
             System.out.println(a +  " / "+ b +  " (we can not divide by zero) ");
         }

        System.out.print(" This is Example  of ");
        System.out.print( "Exception Handling");
    }
}
