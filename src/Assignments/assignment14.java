package Assignments;

import java.util.Scanner;

public class assignment14 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner inputScanner = new Scanner(System.in);
        int numberOne =  inputScanner.nextInt();
        int numberTwo = inputScanner.nextInt();

        if (numberOne > numberTwo){
            System.out.printf(numberOne + " is greater than " + numberTwo);
        }
        else if (numberOne < numberTwo){
            System.out.printf(numberOne + " is smaller than " + numberTwo);
        }
        else {
            System.out.println("Both numbers are equal");
        }
    }
}
