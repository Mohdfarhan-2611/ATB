package Coding2;

import java.util.HashMap;

public class String6_FrequencyofCharacter {

    public static void main(String[] args) {

        String input = "Madam";
        input = input.toLowerCase();
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : inputArray)
        {
            if(hashMap.containsKey(c))
            {
                hashMap.put(c,hashMap.get(c)+1);
            }
            else
            {
                hashMap.put(c, 1);
            }
        }

        for(char c : hashMap.keySet())
        {
            System.out.println(c + ":" + hashMap.get(c));
        }
    }
}
