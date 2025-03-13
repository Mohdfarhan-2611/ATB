package Coding4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaximumOccuringcharacter {

    public static void maximumOccuringCharacter(String input){
        char[] inputArray = input.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : inputArray){
            if(Character.isLetter(c)){
                if(map.containsKey(c)){
                    map.put(c, map.getOrDefault(c, 0)+1);
                }
                else {
                    map.put(c, 1);
                }
            }
        }
        System.out.println(map);

        char maxcharacter = ' ';
        int maximumcount = 0;

        for(char c: map.keySet())
        {
            if(map.get(c)>maximumcount){

                maxcharacter = c;
                maximumcount = map.get(c);

            }
        }

        System.out.println(maxcharacter +":"+ maximumcount);




    }


    public static void main(String[] args) {

        maximumOccuringCharacter("Learn Java Programming you and me");
    }
}
