public class LeadersBrute {
    static void main() {
        int[] arr = {22,58,6,8,7,88};

        for (int i = 0; i < arr.length; i++) {

            boolean leader = true;

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    leader = false;
                    break;
                }
            }

            if (leader) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
