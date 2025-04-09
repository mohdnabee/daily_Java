package loops.demo;

public class diff_DoAndWhile {

    public  static  void main (String [] args){

        // true or false condition

        int i = 12;
        while (i < 11){
            System.out.println("hello while");// do not print value
        }

        do{
            System.out.println("hello do while");// at least one time print
        }while (i<11);

    }
}
