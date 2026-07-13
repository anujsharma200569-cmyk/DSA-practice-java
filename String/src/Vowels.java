public class Vowels {
    public static void main(String[] args) {
        String str = " Hello Anuj";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                    ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result = result + ch;
            }

        }

        System.out.println("After removing vowels :" +result);
    }
}
