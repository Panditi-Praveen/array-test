import java.util.HashSet;

public class Intersection {
    static void main() {

        int[] a={1,2,3,4};
        int[] b={3,4,5,6};

        HashSet<Integer> set=new HashSet<>();

        for(int num:a)
            set.add(num);

        for(int num:b){

            if(set.contains(num))
                System.out.println(num);
        }
    }
}
