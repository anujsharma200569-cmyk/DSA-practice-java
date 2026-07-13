public class CountWords {
    public static void main(String[] args) {

        String str = "Anuj is a Good Boy";


        String[] words = str.trim().split("\\s+");

        System.out.println("Number of words = " + words.length);
    }
}

