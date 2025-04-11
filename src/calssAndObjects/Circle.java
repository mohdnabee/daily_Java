package calssAndObjects;
// 9.	Create a class named Circle with an instance variable radius.
// Create 2 objects and assign different radii. Print the circumference of both circles.
//               Formula : C=2πr
public class Circle {

    int radius ;

     void ci (){

        System.out.println(2*3.14*this.radius);

    }

    public static void main(String[] args) {
        Circle obj = new Circle();
        Circle obj1= new Circle();
        Circle obj2 =  new Circle();

        obj.radius= 12;
        obj1.radius= 4;
        obj2.radius= 8;


        obj.ci();
        obj1.ci();
        obj2.ci();


        System.out.println(2*3.14*obj.radius);
        System.out.println(2*3.14*obj1.radius);
        System.out.println(2*3.14*obj2.radius);


    }

}
