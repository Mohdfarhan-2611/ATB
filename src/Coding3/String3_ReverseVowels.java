package Coding3;

import Coding.ReverseVowels;

public class String3_ReverseVowels {

    public static String ReverseVowels(String input)
    {
        char[] inputArray = input.toCharArray();
        String vowels = "aeiouAEIOU";
        int left= 0;
        int right = inputArray.length-1;

        while (left<right)
        {
            if(vowels.indexOf(inputArray[left])==-1)
            {
                left++;
            } else if (vowels.indexOf(inputArray[right])==-1) {
                right--;
            }
            else{
                char temp = inputArray[left];
                inputArray[left]=inputArray[right];
                inputArray[right]=temp;
                left++;
                right--;
            }
        }

        return new String(inputArray);
    }

    public static void main(String[] args) {

        String result= ReverseVowels("Hello");
        System.out.println(result);
    }
}
