package Assignments;

public class assignment40
{
    public static void main(String args[]) {
        String str = "beautiful beach";
        char[] chArray = str.toCharArray();
        System.out.println("The string is:" + str);
        System.out.print("Duplicate Characters in above string are: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (chArray[i] == chArray[j]) {
                    System.out.print(chArray[j] + " ");
                    break;
                }
            }
        }
    }
}
