public class Product {
    public static void main(String[] args){
        int[] arr ={10,20,30,40,50};
        int product = 1;
        for (int i = 0; i<arr.length; i++){
            product = product *arr[i];
        }
        System.out.println("The product of the elements is =" +product);
    }
}
