package Coding3;

public class String5_Exp2_ReverseEachWord {

    public static String ReverseEachWord(String input)
    {
        String[] inputArray = input.split(" ");
        String reverse = " ";
        //int i = inputArray.length-1;
        for(int i = inputArray.length-1; i>=0; i--)
        {
           reverse = reverse + " "+ inputArray[i];
        }

        return reverse.trim();
    }

    public static void main(String[] args) {

        String result = ReverseEachWord("Hello Mr Farhan");
        System.out.println(result);
    }
}
