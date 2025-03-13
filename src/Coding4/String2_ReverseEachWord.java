package Coding4;


public class String2_ReverseEachWord {

    public static void reverseEachWords(String input){
        String[] inputArray = input.split(" ");
        String reverseEachWord = " ";

        for(String word : inputArray)
        {
            for(int i = word.length()-1; i>=0; i--){

                reverseEachWord = reverseEachWord + word.charAt(i);
            }
            reverseEachWord = reverseEachWord + " ";
        }

        System.out.println(reverseEachWord);


    }

    public static void main(String[] args) {

        reverseEachWords("Java is good programming language");
    }
}
