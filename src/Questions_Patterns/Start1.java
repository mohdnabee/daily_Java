package Questions_Patterns;

public class Start1 {

    public static void main(String[] args) {
        //  sloid retangle
        int n =  3 ;
        int m = 5 ;

        System.out.println("Solid Rectangle:- ");
        //  outer loop
        for (  int i=1;  i< n  ;  i++){

            //  inner  loop
            for ( int j =  1 ; j<= m ;  j++ ){
                System.out.print("*");
            }

            System.out.println();
        }


        System.out.println("Hollow Rectangle ");
        int a=  4 ;
        int b = 5;

//         outer loop
        for (  int i=1;  i<=a; i++){
//              inner loop
            for ( int j=1;  j<=m ; j++){
//                cells -> (i,j)
                if (i==1 || j==1 || i ==a||  j == b){
                    System.out.print("$");
                }else
                    System.out.print(" ");
            }
            System.out.println();
        }


//          Half  Pyramid
        System.out.println(" Half  Pyramid");
        int c =  5 ;
//          outer  Loop
        for (  int i =  1;  i<=c ; i++){
//              inner  loop
            for (int j=1; j<= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }



       


    }

}
