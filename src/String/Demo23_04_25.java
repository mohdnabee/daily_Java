package String;

public class Demo23_04_25 {

    public static void main(String[] args) {

        String str =  "hello";

        String newStr=" ";

        System.out.println("hello"!= "heelo");
         for (int i=0; i<str.length();i++){
             char c= str.charAt(i);

             if (newStr.indexOf(c)==-1){
                 newStr+=c;
             }
         }

        System.out.println(newStr+ "Nabeel");
         
    }
}
