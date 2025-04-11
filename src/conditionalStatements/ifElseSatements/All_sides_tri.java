package conditionalStatements.ifElseSatements;

import java.util.Scanner;

public class All_sides_tri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Sides of Triangle :");

        int side1 = input.nextInt();
        int side2 = input.nextInt();
        int side3 = input.nextInt();

        if((side1 + side2) > side3)

            if((side2 + side3) > side1)

                if((side1 + side3) > side2)

                { if (side1 == side2 &&  side1 == side3 && side2 == side3){
                    System.out.println("All sides are equal");
                    System.out.println("equilateral");}

                    else if (side1 == side2 ||  side1 == side3 || side2 == side3){
                    System.out.println("two sides are equal ");
                    System.out.println("isosceles");}

                    else
                    System.out.println("all sides are unequal");
                    System.out.println("Scalene");

            System.out.println("Triangle is valid.");
        }
                else
                    System.out.println("Triangle is not valid.");
            else
                System.out.println("Triangle is not valid.");
        else
            System.out.println("Triangle is not valid.");

    }
}
