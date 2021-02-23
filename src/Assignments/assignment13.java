package Assignments;

import java.util.Scanner;

public class assignment13 {

    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner inputScanner = new Scanner(System.in);
        int numberEntered = inputScanner.nextInt();
        if (numberEntered < 0){
            System.out.println(numberEntered);
        }
    }
}
