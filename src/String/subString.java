package String;

public class subString {
    public static void main(String[] args) {

        String sentence =  "My Name Is Nabeel";
        // substrin(beg index ,  end index)

        String name =  sentence.substring(11, sentence.length());
        System.out.println(name);


        String sentence1 = "TonyStark";
        String name1 = sentence1.substring(0,4);
        System.out.println(name1);

        String name2 =  sentence1.substring(4);
        System.out.println(name2);

// default takes the ended index value

        //  string is Immutable: cannot be modified String in a memory
    }
}
