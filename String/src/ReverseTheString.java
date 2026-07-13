public class ReverseTheString {

    public static void main(String[] args){

        String s = "Anuj";
        String g = "";

        for (int i = 0; i< s.length(); i++){

            g = s.charAt(i) + g;
        }

        System.out.println(g);
    }
}
