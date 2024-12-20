package November.Array;

import java.util.Arrays;

public class ArrayExpi8 {

    public static void main(String[] args) {
        //Sort an array without inbuild function

        int[] arr = {5,2,4,3,1};
        for(int i = 0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]=temp;
                }
            }
        }

        String str = Arrays.toString(arr);
        System.out.println(str);


    }
}
