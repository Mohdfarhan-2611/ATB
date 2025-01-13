package Coding;

import java.util.HashMap;

public class Countletter {

    public static void CountLetter(String input)
    {
        char[] inputArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(char c : inputArray)
        {
            if (hashMap.containsKey(c))
            {
                hashMap.put(c, hashMap.get(c)+1);
            }

            else
            {
                hashMap.put(c, 1);
            }
        }

        for(char c : hashMap.keySet())
        {
            sb.append(c);
            sb.append(hashMap.get(c));
        }

        System.out.println(sb.toString());

    }

    public static void main(String[] args) {

       CountLetter("aaabbcdd");


    }
}
