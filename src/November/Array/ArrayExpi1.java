package November.Array;

import java.util.Arrays;

public class ArrayExpi1 {
    //Second Largest number in an array

    public static void main(String[] args) {
        int[] arr = {22, 110, 87, 98, 100};
        Arrays.sort(arr);


        int max = arr[arr.length - 1];
        int temp;

        for (int i = 0; i<arr.length; i++)
        {
           for(int j= i+1; j<arr.length; j++)
           {
               if(arr[i] < arr[j])//22 < 110
               {
                   temp = arr[j]; //temp 110
                   arr[j] = arr[i];//22
                   arr[i] = temp;// 110
               }
           }
        }

        System.out.println(arr[1]);

    }

}







