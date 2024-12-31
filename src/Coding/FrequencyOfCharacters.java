package Coding;

import java.util.HashMap;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String input = "madam";
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> frequencymap = new HashMap<Character, Integer>();

        for(char c : inputArray)
        {
            frequencymap.put(c, frequencymap.getOrDefault(c, 0)+1);
        }

        System.out.println(frequencymap.keySet());
        System.out.println(frequencymap.values());

        for(char c : frequencymap.keySet())
        {
            System.out.println(c + ":"+ frequencymap.get(c));
        }

        //System.out.println(frequencymap);









    }
}
