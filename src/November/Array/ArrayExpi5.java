package November.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayExpi5 {

    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,4,4,5};

        Set<Integer> set1 = new HashSet<>();
        for(int num : arr)
        {
            set1.add(num);
        }
        System.out.println("Remove Duplicate from array and converted to set");
        System.out.println(set1);

        Object[] arr2 = set1.toArray();
        String str = Arrays.toString(arr2);
        System.out.println(str);







    }
}
