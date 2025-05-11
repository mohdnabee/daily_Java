package String;

public class StringMultipleMethods {
    public static void main(String[] args) {

        //  \'	'	Single quote
        // \"	"	Double quote
        // \\	\	Backslash

        //The sequence \"  inserts a double quote in a string:
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

        // The sequence \'  inserts a single quote in a string:

        String txt1 =  "It\'s alright.";
        System.out.println(txt1);


        // The sequence \\  inserts a single backslash in a string:

        String txt2 = "The character \\ is called backslash.";
        System.out.println(txt2);


        //  \n	New Line
        String txt3 = "Hello\nWorld!";
        System.out.println(txt3);

        //  \r	Carriage Return
        String txt4 = "Nabeel\rHello!";
        System.out.println(txt4);

        //  \t	Tab
        String txt5 = "its\tSunday!";
        System.out.println(txt5);

        //  \b	Backspace
        String txt6 = "Well\bcome to new  World!";
        System.out.println(txt6);
        //  \f	Form Feed


        //  uppercase and Lowercase
        String txt7 = "Java programing";
        System.out.println(txt7.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txt7.toLowerCase());   // Outputs "hello world"

        //  find character
        String txt8 = "Please locate where 'locate' occurs!";
        System.out.println("Locate find at the value of : "+txt8.indexOf("locate")); // Outputs 7
    }


}
