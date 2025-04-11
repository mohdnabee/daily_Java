package conditionalStatements.ifElseSatements;

import java.util.Scanner;
class Triangle_Valid
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Three Angles of Triangle :");
        int angle1 = input.nextInt();
        int angle2 = input.nextInt();
        int angle3 = input.nextInt();
        int sum = angle1 + angle2 + angle3;

        if(sum == 180 && angle1 > 0 && angle2 > 0 && angle3 > 0)
        {
            System.out.println("Triangle is valid");
            if (angle1 == 90 || angle2 == 90 || angle3 == 90 ){
                System.out.println("Right angle ");
            } else if (angle1 == 60 || angle2 == 60|| angle3 == 60){
                System.out.println("Equilateral Triangle ");
            }

        }
        else
        {
            System.out.println("Triangle is not valid");
        }
    }
}