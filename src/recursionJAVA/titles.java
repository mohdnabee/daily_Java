package recursionJAVA;

public class titles {

    public  static  int placeTitles(int n ,  int m){
//  base case
        if ( n ==  m ){
            return  2;
        }
        if (n < m){
            return 1 ;
        }

        //  vertical
        int vertical =  placeTitles(n-m, m);

        //  horizontals
        int horizontals =  placeTitles(n-1,m);

        return  vertical + horizontals  ;
    }

    public static void main(String[] args) {

        int m  =  2 ,  n =4 ;
        int totalTiles =  placeTitles(n,m);
        System.out.println(totalTiles);

    }
}
