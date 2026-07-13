public class RemovingAllExceptAlphabet {
    public static void main(String[] args) {

        String str = "A1n@u#j 12Sharma!";

        String result = str.replaceAll("[^a-zA-Z]", "");

        System.out.println("Original String: " + str);
        System.out.println("After Filteration : " + result);
    }
}
