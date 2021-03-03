package Assignments;

public class assignment34 {

    //creating a function revers that takes in an array as input
    //n is arr.length
    static void reverse(int a[], int n){
        //new array of the same length
        int[] array = new int [n];
        //storing the length of the array to j
        int j = n;

        //loop from the back and put everything in the new array
        for (int i = 0; i < n; i++){
            array[j-1] = a[i];
            j = j-1;
        }
        /*printing the reversed array*/
        System.out.println("Reversed array is: \n");
        for (int k = 0; k < n; k++) {
            System.out.println(array[k]);
        }
    }





    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};
        reverse(arr, arr.length);
    }
}
