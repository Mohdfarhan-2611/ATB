package Coding2;

public class String4_ReverseVowels {

    public static void main(String[] args) {

        String input = "Hello"; //e , o are vowels and both should be reversed
        String vowels = "aeiouAEIOU";

        char[] inputArray = input.toCharArray();
        int left =0;
        int right = input.length()-1;

        while(left<right)
        {
            if(vowels.indexOf(inputArray[left])==-1)
            {
                left++;
            } else if (vowels.indexOf(inputArray[right])==-1)
            {
                right--;
            }
            else
            {
                char temp = inputArray[left];
                inputArray[left] = inputArray[right];
                inputArray[right] = temp;
                left++;
                right--;
            }

        }

        System.out.println(new String(inputArray));
    }
}
