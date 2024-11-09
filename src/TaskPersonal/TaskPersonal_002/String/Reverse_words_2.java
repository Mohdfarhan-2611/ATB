package TaskPersonal.TaskPersonal_002.String;

import java.util.Scanner;

public class Reverse_words_2 {

    static void reverseEachWords(String inputString)
    {
        String[] words = inputString.split(" ");
        String reverse = "";
        int length = words.length;

        for(int i= words.length-1; i>=0; i--)
        {
            reverse = reverse + " " + words[i];
        }

        System.out.println(reverse.trim());
    }

    public static void main(String[] args) {

        reverseEachWords("Java is a good Programming language");
    }
}
