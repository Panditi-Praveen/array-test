public class RightRotation {
    static void main() {
        int[] arr ={1,2,3,4,5};
        int i;
        int temp =arr[arr.length-1];
        for(i = arr.length-2; i>=0; i--){
            arr[i+1]= arr[i];
        }
        arr[0] = temp;
        System.out.println("Right array:");
        for (i =0; i<arr.length; i++){
            System.out.println(arr[i]+"");
        }
    }
}
