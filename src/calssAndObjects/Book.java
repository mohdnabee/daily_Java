package calssAndObjects;

public class Book {
    // 3.	Create a class named Book with two instance variables: title and author.
    // Create an object and assign values to these variables. Print the values.

    String title;
    String author;

    public static void main(String[] args) {



        Book book = new Book();

        book.title = "Programing.Java ";
        book.author="MOhd Nabeel";

        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);



    }
}
