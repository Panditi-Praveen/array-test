public class LeftRotation {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};

        int temp = arr[0];
        int i;

        for(i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;

        System.out.println("Array rotation after will be:");

        for(i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}