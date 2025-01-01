package Coding3;

import java.util.Scanner;

public class String1_ReverseLetter {

    public static String ReverseLetter(String input) {
        char[] inputArray = input.toCharArray();
        int left =0;
        int right = inputArray.length-1;

        while(left<right)
        {
            if(!Character.isLetter(inputArray[left]))
            {
                left++;
            } else if (!Character.isLetter(inputArray[right])) {
                right--;
            }
            else{
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(inputArray);
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string");
//        String input = sc.next();
        String result = ReverseLetter("you are Farhan");
        System.out.println(result);

    }
}
