package November.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayExpi4 {
    public static void main(String[] args) {
        //Find common element between two arrays
        int[]  arr1 = {1,2,3,4,5};
        int[]  arr2 = {4,5,6,7,8};

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int num: arr1)
        {
            set1.add(num);
        }

        System.out.println(set1);

        for(int num: arr2)
        {
            if (set1.contains(num))
            {
                set2.add(num);
            }
        }
        System.out.println(set2);


        //        for(int i=0; i<arr1.length; i++)
//        {
//            for(int j=0; j<arr2.length; j++)
//            {
//                if(arr1[i]==arr2[j])
//                {
//                    System.out.println(arr1[i]);
//                }
//            }
//        }

     }
}
