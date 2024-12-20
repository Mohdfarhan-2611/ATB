package November.Array;

import java.util.Arrays;

public class ArrayExpi7 {

    public static void rotate(int[] arr, int num)
    {
          reverse(arr, 0, arr.length-1);
          reverse(arr, 0, num-1);
          reverse(arr, num, arr.length-1);

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

        int[] array = {1,2,3,4,5,6,7};
        rotate(array,3);

        String str = Arrays.toString(array);
        System.out.println(str);
    }
}
