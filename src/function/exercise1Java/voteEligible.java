package function.exercise1Java;

import java.util.Scanner;

// write a function that takes in age as input and returns if that person is
// eligible to vote or not .A person of age >18 is eligible to vote
public class voteEligible {

    // fucntion
    public  static  void VoteCheckAge(int age ){

        if (age >=18){
            System.out.println("Eligible for vote ");
        }else {
            System.out.println("Not Eligible for vote ");
        }


    }


    public static void main(String[] args) {

        Scanner vote =  new Scanner(System.in);
        System.out.print("Enter the age : ");
        int age =   vote.nextInt();

        VoteCheckAge(age);

    }
}
