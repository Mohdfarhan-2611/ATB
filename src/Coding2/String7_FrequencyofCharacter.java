package Coding2;

import java.util.HashMap;

public class String7_FrequencyofCharacter {

    public static void main(String[] args) {
        String input = "madam";
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : inputArray)
        {
            hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for(char c : hashMap.keySet())
        {
            System.out.println(c +":"+ hashMap.get(c));
        }

    }
}
