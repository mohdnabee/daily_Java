package methods;
import  java.util.*;
    public class FormulaCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Choose a formula:");
            System.out.println("1. Area of Rectangle (A = length * width)");
            System.out.println("2. Perimeter of Rectangle (P = 2 * (length + width))");
            System.out.println("3. Quadratic Formula (x = (-b ± √(b² - 4ac)) / 2a)");
            System.out.println("4. Simple Interest (SI = (P * R * T) / 100)");
            System.out.println("5.  Area of a circle( A = πr^2) ");
            System.out.println( "6 (a+b)^2 =  a^2 + b^2 + 2ab");
            System.out.println("7. (a+b)^3 =  a^3+3a^2b+ 3 ab^3 +B^3");
            System.out.print("Enter your choice (1-4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    rectangleArea(scanner);
                    break;
                case 2:
                    rectanglePerimeter(scanner);
                    break;
                case 3:
                    quadraticFormula(scanner);
                    break;
                case 4:
                    simpleInterest(scanner);
                    break;
                case 5 :
                    AreaofCircele(scanner);
                    break;
                case 6 :
                    Algebraic_formula1(scanner);
                    break;
                case 7 :
                    Algebraic_formula2(scanner);
                    break;

                default:
                    System.out.println("Invalid choice");
            }
            scanner.close();


        }

        public static void rectangleArea(Scanner scanner) {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            double area = length * width;
            System.out.println("Area of Rectangle: " + area);
        }

        public static void rectanglePerimeter(Scanner scanner) {
            System.out.print("Enter length: ");
            double length = scanner.nextDouble();
            System.out.print("Enter width: ");
            double width = scanner.nextDouble();
            double perimeter = 2 * (length + width);
            System.out.println("Perimeter of Rectangle: " + perimeter);
        }

        public static void quadraticFormula(Scanner scanner) {
            System.out.print("Enter a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter b: ");
            double b = scanner.nextDouble();
            System.out.print("Enter c: ");
            double c = scanner.nextDouble();
            double determinant = b * b - 4 * a * c;
            if (determinant >= 0) {
                double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
                double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
                System.out.println("Roots: " + root1 + " and " + root2);
            } else {
                System.out.println("No real roots");
            }
        }

        public static void simpleInterest(Scanner scanner) {
            System.out.print("Enter principal amount (P): ");
            double principal = scanner.nextDouble();
            System.out.print("Enter rate of interest (R): ");
            double rate = scanner.nextDouble();
            System.out.print("Enter time (T): ");
            double time = scanner.nextDouble();
            double interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: " + interest);
        }

        public  static  void  AreaofCircele(Scanner scanner ){


            System.out.print("Enter radius: ");
            double radius = scanner.nextDouble();
            double area = 3.14 * radius * radius;
            double circumference = 2 * 3.14 * radius;
            System.out.println("Area: " + area);
            System.out.println("Circumference: " + circumference);
            scanner.close();

        }

        public  static  void Algebraic_formula1(Scanner scanner ){

            System.out.print("Enter a : ");
            double a =  scanner.nextInt();
            System.out.print("Enter b : ");
            double b =  scanner.nextInt();
            double square= a*a+ b*b + 2 *a *b ;
            System.out.println("(a+b)^2 = "+square);
        }

        public  static  void Algebraic_formula2(Scanner scanner ){
            System.out.print("Enter a : ");
            double a =  scanner.nextInt();
            System.out.print("Enter b : ");
            double b =  scanner.nextInt();
            System.out.println( "  formula = (a+b)^3 = a^3+3a^2b+ 3 ab^3 +B^3");
            double square= a*a*a + 3*a*a*b + 3*a*b*b + b*b*b ;
            System.out.println("(a+b)^3 = "+square);
        }

    }
