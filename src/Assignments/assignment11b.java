package Assignments;

public class assignment11b {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;

        System.out.println(x +" Before swap "+ y);


        // Code to swap 'x' (1010) and 'y' (0101)
        x = x ^ y; // x now becomes 15 (1111)
        y = x ^ y; // y becomes 10 (1010)
        x = x ^ y; // x becomes 5 (0101)

        System.out.println("After swap: x = "
                + x + ", y = " + y);
    }
}
