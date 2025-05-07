package Polymorphism;
// Design a class Book with overloaded methods to display book details in different formats.
//One method should display the title and author, and another should display the title, author, and price.

class Book {

    String title (){
        return "JAVA Programming ";
    }

    String Author (){
        return "Mohd Nabeel";
    }

    int priceOVER (){
        return 1800;
    }

}

public class overLOadingq3 {
    public static void main(String[] args) {


        Book obj = new Book();
        System.out.println("Title of book : "+obj.title());
        System.out.println("Author of book : "+obj.Author());
        System.out.println("Price of book : "+obj.priceOVER());


    }
}
//=========================//===============================//===============================//=========================