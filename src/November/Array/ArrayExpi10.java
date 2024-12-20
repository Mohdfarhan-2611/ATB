package November.Array;

import java.util.Arrays;

public class ArrayExpi10 {


    public static void main(String[] args) {

        int[] arr2 = {1,2,3,0,0,4,5};
        int nonZeroIndex = 0;

        for(int i=0; i< arr2.length; i++)
        {
              if(arr2[i]!=0)
              {
                  int temp = arr2[nonZeroIndex];
                  arr2[nonZeroIndex] = arr2[i];
                  arr2[i]= temp;
                  nonZeroIndex++;
              }

        }

        String str = Arrays.toString(arr2);
        System.out.println(str);


    }




}
