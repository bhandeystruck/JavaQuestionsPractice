package Assignments;

public class assignment18 {
    public static void main(String[] args) {

        int i;

        int array [] = {1,2,3};

        int max = array[0];

        for ( i = 1; i< array.length; i++)
        {
            if (array[i] > max)
            {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
