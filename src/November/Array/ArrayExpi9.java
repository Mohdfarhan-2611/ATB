package November.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayExpi9 {

    //Remove duplicate from an array

    public static void main(String[] args) {

        int[] arr = {1,2,3,3,4,4};
        Set<Integer> set1 = new HashSet<>();
        for(int num : arr)
        {
            set1.add(num);
        }

        System.out.println(set1);

        int[] arr2 = new int[set1.size()];
        int i=0;
        for(int num : set1)
        {  arr2[i] = num;
            i++;
        }

        String str = Arrays.toString(arr2);
        System.out.println(str);







    }
}
