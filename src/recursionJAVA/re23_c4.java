package recursionJAVA;

public class re23_c4 {

    public static void movellx(String str ,int idx, int count, String newString){

        if(idx ==  str.length()){
            for (int i=0; i<count; i++){
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar =  str.charAt(idx);
        if(currChar == 'x'){
            count ++;
            movellx(str,idx+1, count,newString);
        }else {
            newString += currChar; /// newString =  newString + currChar =>  shortcut
            movellx(str,idx+1,count,newString);
        }


    }


    public static void main(String[] args) {

        String str =  "axbcxxd";
        movellx(str,0,0,"");

    }
}
