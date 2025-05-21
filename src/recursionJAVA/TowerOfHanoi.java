package recursionJAVA;

public class TowerOfHanoi {

    public static void Tower(int n ,String src, String helper, String dest){

        //  base case
        if (n == 1){
            System.out.println("transfer disk "+ n +" from "+ src + " to "+ dest);
            return;
        }

        Tower(n-1, src,dest, helper);
        System.out.println("transfer disk "+ n +" from "+ src + " to "+ dest);
        Tower(n-1, helper,src,dest);

    }
    
    public static void main(String[] args) {
        int n = 3;
        Tower(n,"S","H","D");
    }
}
