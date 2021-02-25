package Assignments.assignment20;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        //variables for two number
        int numb1;
        int numb2;
        String operation;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter the first number :");
        numb1= inputScanner.nextInt();

        System.out.println("Enter the second number :");
        numb2= inputScanner.nextInt();

        Scanner operationScanner = new Scanner(System.in);
        System.out.println("Enter the operator :");
        operation = operationScanner.next();

        if (operation == "+")
        {
            System.out.println("your answer is" + (numb1 + numb2));
        }
        else if  (operation == "-")
        {
            System.out.println("your answer is" + (numb1 - numb2));
        }
        else
        if (operation == "/")
        {
            System.out.println("your answer is" + (numb1 / numb2));
        }
        else
        if (operation == "*")
        {
            System.out.println("your answer is" + (numb1 * numb2));
        }


    }





}
