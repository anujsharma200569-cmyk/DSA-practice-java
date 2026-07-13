public class RemovingSpace {
    public static void main(String[] args) {
        String str = "Hello Lieutenant Anuj Sharma";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' '){
                result = result + ch;
            }

        }
        System.out.println("The original String is :" + str);
        System.out.println("After removing the Spaces :" + result);
    }
}
