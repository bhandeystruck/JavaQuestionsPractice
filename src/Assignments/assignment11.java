package Assignments;

public class assignment11 {
    public static void main(String[] args){
        int numberOne = 45;
        int numberTwo = 56;

        System.out.println("The numbers before swapping are " + numberOne + " || " + numberTwo);

        //assigning value to temp
        int temp = numberOne;

        //Second value assigned to first
        numberOne = numberTwo;

        numberTwo = temp;
        System.out.println("--After swap--");
        System.out.println(numberOne+" || "+numberTwo);
    }
}
