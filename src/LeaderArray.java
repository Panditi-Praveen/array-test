import java.util.ArrayList;
import java.util.Collections;

public class LeaderArray {
    static void main() {
        int[] arr = {16,17,4,3,5,2};

        ArrayList<Integer> leaders = new ArrayList<>();

        int max = arr[arr.length - 1];
        leaders.add(max);

        for(int i = arr.length - 2; i >= 0; i--) {

            if(arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }

        Collections.reverse(leaders);

        System.out.println(leaders);
    }
}
