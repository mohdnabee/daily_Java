package ExceptionHAndling;

public class class2EH {
    public static void main(String[] args) {
         int []  arr =  {1 , 2 , 3, 4};
       // System.out.println(arr[6]);

        try {
            System.out.println(arr[6]);
        }
        catch (Exception e){
            System.out.println("Not find In the array ");
            System.out.println(e);
        }

        System.out.println("Exception Handling....|| 21-05-25 ||  ");

    }
}
