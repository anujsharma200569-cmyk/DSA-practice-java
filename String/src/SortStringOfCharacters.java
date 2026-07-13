import java.util.Arrays;

public class SortStringOfCharacters {
    public static void main(String[] args) {

        String str = "zyx";
        char[] ch = str.toCharArray();


        Arrays.sort(ch);
        String sorted = new String(ch);

        System.out.println("Original String: " + str);
        System.out.println("Sorted String: " + sorted);
    }
}

