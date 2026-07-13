public class SmallestAndLargestWord {
    public static void main(String[] args) {
String str = "Hello Anuj Sharma";

String[] words = str.split(" ");

String smallest = words[0];
String largest = words[0];

        for (int i = 0; i < str.length(); i++) {

            if (words[i].length() < smallest.length()){
                smallest = words[i];
            }

            if (words[i].length() < largest.length()){
                largest = words[i];
            }

        }

        System.out.println("Smallest number is :" +smallest);
        System.out.println("Largest number is :" +largest);
    }
}
