public class SecondLargest {
    static void main() {
        int arr[] ={1,2,5,9,11,5};
        int i;
        int largest = arr[0];
        int Slargest = -1;
        for (i=0; i< arr.length; i++){
            if (arr[i]>largest) {
                largest = arr[i];
            }
        }
        for (i=0; i<arr.length; i++){
            if (arr[i]> Slargest && arr[i]!=largest){
                Slargest = arr[i];

            }
        }
        System.out.println("The Second LargestIs :"+ Slargest);
    }
}
