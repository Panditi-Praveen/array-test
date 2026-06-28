public class MaxMin {
    static void main() {
        int[] arr={10,45,3,99,22};

        int max=arr[0];
        int min=arr[0];

        for(int i=1;i<arr.length;i++){

            if(arr[i]>max)
                max=arr[i];

            if(arr[i]<min)
                min=arr[i];
        }

        System.out.println("Maximum = "+max);
        System.out.println("Minimum = "+min);
    }
}
