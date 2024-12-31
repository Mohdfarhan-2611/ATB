package November.Array2;

import November.November2.A;

import java.util.ArrayList;

public class Array1 {

    public static void main(String[] args) {
        int[] arr = {-11, -12, 3, 5, -13, -10, 2,3,4};

        ArrayList<Integer> negative = new ArrayList<>();
        ArrayList<Integer> positive = new ArrayList<>();

        for(int num : arr)
        {
            if(num<0)
            {
                negative.add(num);
            }
            if (num>0)
            {
               positive.add(num);
            }
        }

        ArrayList<Integer> combinedlist = new ArrayList<>(negative);
        for(int num : positive)
        {
            combinedlist.add(num);
        }

        System.out.println(combinedlist);
    }
}
