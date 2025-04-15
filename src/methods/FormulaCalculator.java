package methods;
import  java.util.*;
    public class FormulaCalculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean running =  true;
            System.out.println("Choose a formula:");
            System.out.println("1. basic Calculator ");
            System.out.println("2. Perimeter of Rectangle (P = 2 * (length + width))");
            System.out.println("3. Quadratic Formula (x = (-b ± √(b² - 4ac)) / 2a)");
            System.out.println("4. Simple Interest (SI = (P * R * T) / 100)");
            System.out.println("5.  Area of a circle( A = πr^2) ");
            System.out.println( "6 (a+b)^2 =  a^2 + b^2 + 2ab");
            System.out.println("7. (a+b)^3 =  a^3+3a^2b+ 3 ab^3 +B^3");
            System.out.println("8. Area of Rectangle (A = length * width)");
            System.out.println("9. Triangle: Area = ½ Base x Height");
            System.out.println("10 Area of Parallelogram = base x height");
            System.out.print("Enter your choice (1-8):");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Calculator(scanner);
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
                case 8 :
                    rectangleArea(scanner);
                    break;
                case 9 :
                    AreaOfTriangle(scanner);
                    break;
                case 10:
                    AreaofParallelogram(scanner);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            scanner.close();

        }
        public static  void Calculator (Scanner scanner){

            System.out.print("enter the value of num1 :");
            int num1 =  scanner.nextInt();
            System.out.print("enter the value of num2  : ");
            int num2= scanner.nextInt();
            System.out.println("Enter the operator : + , - , / , %, *");
            char operator = scanner.next().charAt(0);
            switch (operator) {
                case '+':
                    System.out.println("sum : " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("subtraction : " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("Multiple " + (num1 * num2));
                    break;
                case '/':
                    if (num2 != 0) {
                        System.out.println("Divide " + (num1 / num2));
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                case '%':
                    System.out.println("module : "+(num1 % num2 ));
                    break;
                default:
                    System.out.println("Invalid operator");
            }

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

        public  static  void AreaOfTriangle(Scanner scanner ){
            System.out.print("Enter the base : ");
            int base = scanner.nextInt();
            System.out.print("Enter the height : ");
            int height =  scanner.nextInt();

            System.out.println(" Area of triangle is : "+ 0.5*base*height);
        }

        public static  void  AreaofParallelogram (Scanner scanner){
            System.out.print( "Enter the base ");
            int base =  scanner.nextInt();
            System.out.print("Enter the height ");
            int height =  scanner.nextInt();
            System.out.println("Area of Parallelogram = base x height : "+ (base * height));
        }

    }
