package November.Array2;

import java.util.Arrays;

public class Array2 {

    public static void main(String[] args)
    {
        int[] arr1 = {10,11,12,32,33};
        //Sorting array
        Arrays.sort(arr1);

        String str = Arrays.toString(arr1);
        System.out.println(str);

        //Second largest element
        System.out.println("Second largest element: " +arr1[arr1.length-2]);





    }
}
