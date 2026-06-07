public class LargestNumber {
    static void main() {

       int arr[]={1,4,12,3,9};
        int i;
        int max = arr[0];
        for (i=0; i < arr.length-1; i++){
            if (arr[i]> max)
                max =arr[i];
        }
        System.out.println("Maximum:" +max);


    }
}
