package Coding5_Stringpractice;

public class String3_CountVowelsAndConsonants {

    public static void countVowels(String input){
        int vowels = 0;
        int consonant = 0;

        for(char c : input.toLowerCase().toCharArray()){
            if(Character.isLetter(c)){
               if("aeiou".indexOf(c) != -1){
                  vowels++;
                }
                else{
                    consonant++;
                }
            }
        }

        System.out.println("Vowels: "+vowels);
        System.out.println("Consonants: "+consonant);


    }

    public static void main(String[] args) {

        countVowels("JAv@@@A Programming");
    }
}
