package Coding4;

import java.util.HashMap;

public class String3_DuplicateCharactersInString {

    public static void duplicateCharacters(String input) {
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();


        for(char c : inputArray)
        {
            if(Character.isLetter(c)) {
                if (characterIntegerHashMap.containsKey(c)) {
                    characterIntegerHashMap.put(c, characterIntegerHashMap.get(c) + 1);
                } else {
                    characterIntegerHashMap.put(c, 1);
                }
            }
        }

        for(char c : characterIntegerHashMap.keySet())
        {
            if(characterIntegerHashMap.get(c)>1) {
                System.out.println(c +":"+ characterIntegerHashMap.get(c));
            }
        }
    }

    public static void main(String[] args) {

        duplicateCharacters("Learn Java Programming you and me");
    }
}
