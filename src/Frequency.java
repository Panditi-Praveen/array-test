import java.util.HashMap;

public class Frequency {
    static void main() {

        int[] arr={1,2,2,3,1,1,4};

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int num:arr){

            map.put(num,map.getOrDefault(num,0)+1);
        }

        System.out.println(map);
    }

}
