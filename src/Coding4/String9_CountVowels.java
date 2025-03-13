package Coding4;

public class String9_CountVowels {

    public static void countVowels(String input){
        char[] inputArray = input.toCharArray();
        int vowels = 0;
        int consonant = 0;

        for(char c : inputArray)
        {
            if(Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u') {
                    vowels++;
                } else {
                    consonant++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonant);
    }


    public static void main(String[] args) {

        countVowels("Hello World");
    }
}
