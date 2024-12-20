package November.Array;

import java.util.Arrays;

public class ArrayExpi2 {

    public static void main(String[] args) {
        int arr[] = {1,2,0,3,4,0,5};
        int nonZeroIndex=0;
        int temp;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;


                nonZeroIndex++;
            }
        }

        String str = Arrays.toString(arr);
        System.out.println(str);




    }
}
