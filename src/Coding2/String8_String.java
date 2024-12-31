package Coding2;

import java.util.HashMap;

public class String8_String {

    public static void main(String[] args) {

        String input = "aabbcccdd";   //output: a3b2c1
        char[] inputArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : inputArray)
        {
            hashMap.put(c , hashMap.getOrDefault(c,0)+1);
        }

        for(char c : hashMap.keySet())
        {
            sb.append(c).append(hashMap.get(c));
        }

        System.out.println(sb.toString());




    }
}
