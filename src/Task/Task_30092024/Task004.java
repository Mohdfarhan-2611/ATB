package Task.Task_30092024;

import java.util.Arrays;

public class Task004 {

//    Find the largest and smallest
//    element in an Array
//
//    int[] array = {5, 2, 9, 1, 6, 3};
//
//    Call ended
//17:16
//        | 2h 1m 29s
//
//    Missed call
//    Naveen |
//            17:16
//
//    No answer
//17:16




    public static void main(String[] args) {
        int[] array = {5, 2, 9, 1, 6, 3};
        Arrays.sort(array);

        System.out.println("Largest num: "+array[array.length-1]);
        System.out.println("Smallest num: "+array[0]);


    }



}
