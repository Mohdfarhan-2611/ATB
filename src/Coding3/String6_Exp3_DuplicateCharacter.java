package Coding3;

import java.util.HashMap;

public class String6_Exp3_DuplicateCharacter {

    public static void DuplicateCharacter(String input)
    {
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(Character c : inputArray)
        {
            if(c!=' ')
                hashMap.put(c, hashMap.getOrDefault(c, 0)+1);
        }

        for(char c: hashMap.keySet())
        {
            if(hashMap.get(c)>1)
                System.out.println(c +":"+hashMap.get(c));
        } 
    }

    public static void main(String[] args) {

        DuplicateCharacter("Learn Java Programming");
    }
}
