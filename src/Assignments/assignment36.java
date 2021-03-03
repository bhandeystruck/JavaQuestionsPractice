package Assignments;

public class assignment36 {
    public static void main(String[] args) {

        String[] names = { "Java", "JavaScript", "Python", "C", "Ruby", "Java" };

        // First solution : finding duplicates using brute force method
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equals(names[j]) ) {
                    // got the duplicate element
                    System.out.println(names[i] + " and " + names[j] + " are duplicate ");
                }
            }
        }

    }
}
