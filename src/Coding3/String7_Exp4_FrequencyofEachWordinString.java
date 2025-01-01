package Coding3;

import Coding.FrequencyOfCharacters;

import java.util.HashMap;

public class String7_Exp4_FrequencyofEachWordinString {

    public static void FrequencyOfWords(String input)
    {
        String[] inputArray = input.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String s : inputArray)
        {
            //hashMap.put(s, hashMap.getOrDefault(s, 0)+1);
            if(hashMap.containsKey(s))
            {
                hashMap.put(s, hashMap.get(s)+1);
            }
            else
            {
                hashMap.put(s, 1);
            }

        }

        for(String s : hashMap.keySet())
        {
            System.out.println(s + ":"+ hashMap.get(s));
        }
    }


    public static void main(String[] args) {

        FrequencyOfWords("Test Automation Java Automation");
    }
}
