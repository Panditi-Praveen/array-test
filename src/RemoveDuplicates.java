import java.util.*;
public class RemoveDuplicates {
    public static void main(String[]args) {
        int [] arr ={1,2,3,4,3,4,1,5};
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<arr.length; i++){

            set.add(arr[i]);
        }
        System.out.println("Array after removing:"+set);
        System.out.println("Size of the Array:"+set.size());
        
    }
}
