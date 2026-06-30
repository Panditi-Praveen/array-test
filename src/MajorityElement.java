public class MajorityElement {
    static void main() {
        int[] arr = {2,2,1,2,3,2,2};

        int candidate = 0;
        int count = 0;

        for (int num : arr) {

            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        System.out.println("Majority Element = " + candidate);
    }
}
