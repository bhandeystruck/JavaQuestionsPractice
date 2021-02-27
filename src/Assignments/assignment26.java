package Assignments;

import java.util.Scanner;

public class assignment26 {
    public static void main(String[] args) {
        System.out.println("Enter a number to be reversed : ");
        Scanner inputScanner = new Scanner(System.in);
        int num = inputScanner.nextInt();
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
