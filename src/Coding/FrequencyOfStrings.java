package Coding;

import java.util.HashMap;

public class FrequencyOfStrings {

    public static void main(String[] args) {
        String input = "men will be men";
        String[] inputArray = input.split(" ");
        HashMap<String, Integer> frequecymap = new HashMap<>();

        for(String s : inputArray)
        {
            frequecymap.put(s, frequecymap.getOrDefault(s, 0)+1);
        }

        System.out.println(frequecymap);


    }
}
