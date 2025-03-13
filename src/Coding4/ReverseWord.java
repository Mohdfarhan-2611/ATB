package Coding4;

public class ReverseWord {

    public static void reverseWord(String input){
        String[] word = input.split(" ");
        String reverse = " ";


        for(int i= word.length-1; i>=0; i--) {

            reverse = reverse + " ";
            reverse = reverse + word[i];
        }


        System.out.println(reverse.trim());

    }

    public static void main(String[] args) {

        reverseWord("Java is Programming language");

    }
}
