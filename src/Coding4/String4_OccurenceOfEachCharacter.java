package Coding4;

import java.util.HashMap;

public class String4_OccurenceOfEachCharacter {

    public static void occurenceOfEachCharacter(String input){
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : inputArray) {
            if (Character.isLetter(c)) {
                if (hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c, 1);
                }
            }
        }
        System.out.println(hashMap);
    }

    public static void main(String[] args) {

        occurenceOfEachCharacter("Java is good programming");
    }
}
