package Dsa;

public class CountVowelAndCons {
    public static void main(String[] args) {

        String str  =  "nabeel";
        System.out.println("String: "+str);

        int vowels =  0  ;
        int consonants =0;

        str =  str.toLowerCase();

        for (int i=0 ; i<str.length();i++){
            char ch  =  str.charAt(i);

            if (Character.isLetter(ch)){

                if(ch =='a' ||  ch=='e' ||ch=='i'|| ch =='o'|| ch =='u'){
                    vowels ++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("vowels : "+vowels);
        System.out.println("Consonants : "+consonants);
    }
}
