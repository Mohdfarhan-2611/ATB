package November.Array;

import java.util.Arrays;

import static java.util.Collections.reverse;

public class ArrayExpi6 {

    public static void rotate(int[] arr, int k)
    {
        k=k%arr.length;
        reverse(arr, 0, arr.length-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, arr.length-1);

    }


    public static void reverse(int[] arr, int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
//        Input:
          int[] Array= {1, 2, 3, 4, 5, 6, 7};
//        n = 3
//        Output:
//        Rotated Array: [5, 6, 7, 1, 2, 3, 4}
          rotate(Array, 3);
          String str = Arrays.toString(Array);
         System.out.println(str);









    }

}
