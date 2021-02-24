package Assignments;

import java.util.Scanner;

public class assignment16 {
    public static void main(String[] args) {
        Scanner inputScnaner = new Scanner(System.in);
        System.out.println("Please enter the number you find to see is even or odd :");
        int theNumber = inputScnaner.nextInt();

        if (theNumber == 0)
        {
            System.out.println("Number is Zero");
        }
        else
        if (theNumber % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
