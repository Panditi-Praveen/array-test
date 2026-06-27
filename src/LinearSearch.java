public class LinearSearch {

    static void main() {



        int[] arr = {5, 10, 15, 20, 25};
        int key = 20;

        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                System.out.println("Found at Index " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Not Found");
        }
    }
}