package November.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayExpi3 {
    //Write a program to merge two sorted arrays
    // into a single sorted array without duplicates.

    //create a set
    //add both array element
    //convert set back into array
    //sorted it
    //print it

    public static void main(String[] args) {
        int[] a = {10,30,40,50,20,50};
        int[] b = {100,60,80,90,70,100};

        Set<Integer> set1 = new HashSet<>();

        for(int num : a)
        {
            set1.add(num);
        }
        for(int num : b)
        {
            set1.add(num);
        }

        System.out.println("Set output:");
        System.out.println(set1);

        int[] c = new int[set1.size()];
        int i=0;
        for(int num : set1)
        {
            c[i] = num;
            i++;
        }

        Arrays.sort(c);

        String str = Arrays.toString(c);
        System.out.println("Merged array will be below:");
        System.out.println(str);








    }
}
