package recursionJAVA;


public class recusrion23_05_25 {

    public  static  void PrintRev(String str ,  int idx){
        if (idx == 0 ){
            System.out.print(str.charAt(idx));
            return;
        }

        System.out.print(str.charAt(idx));
        PrintRev(str,idx-1);

    }


    public static void main(String[] args) {

        String str =  "ABCD";
        PrintRev(str,str.length()-1);

    }
}
