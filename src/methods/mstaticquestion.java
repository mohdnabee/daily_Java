package methods;

public class mstaticquestion {

    static  void conversion (){

        int a =4 ;
        float f= a;
        System.out.println("int to float" +f);

        float b = 5f ;
       int i =  (int)b;
        System.out.println("float to int "+i);
    }

    public static void main(String[] args) {
          conversion();
    }
}
