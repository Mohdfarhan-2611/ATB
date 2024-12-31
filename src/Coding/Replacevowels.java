package Coding;

import java.util.Locale;

public class Replacevowels {

    public static boolean isVowel(char c)
    {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
        {
            return true;
        }
        else
            return  false;
    }


    public static void main(String[] args) {

        String input = "name";
        String Lowercaseinput = input.toLowerCase();
        char[] inputArray = Lowercaseinput.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (Character c : inputArray) {
            if (isVowel(c)) {
                sb.append('x');
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());


    }
}