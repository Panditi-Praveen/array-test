public class RemovingZeros {
    static void main() {
        int[] arr ={1,0,2,0,3,0,0,4};
        int i;
        for (i=0; i<arr.length; i++){
            if (arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
        for (i=0; i<arr.length; i++){
            if (arr[i]==0){
                System.out.println(arr[i]);
            }
        }
    }
}
