package Sharing;

import java.util.Scanner;

public class OperatorsJava {
    public static void main(String[] args) {

        System.out.println("1. Arithmetic Operators");
        System.out.println("2. Relational Operators");
        System.out.println("3. Logical Operators");
        System.out.println("4. bitWise Operators ");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Case Number : ");
        int oper = sc.nextInt();
        switch (oper){
            case  1 :
                ArithmeticOperators  operator=  new ArithmeticOperators();
                operator.binaryOperators();
                break;
            case 2 :
                RelationalOperators operators1 =  new RelationalOperators();
                operators1.RelationOpe();
                break;
            case 3 :
                logicalOpertaors opertaors2 = new logicalOpertaors();
                opertaors2.logicalOpere();
            case 4 :
                bitWiseOperators operators3 = new bitWiseOperators();
                operators3.bitWiseOper();
                break;
            default:
                System.out.println(" Not Recorded  or Invalid Number");
                break;
        }

    }
}
