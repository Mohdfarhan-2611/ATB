package Coding5_Stringpractice;

import java.util.HashMap;
import java.util.Map;

public class String4_FirstNonRepeatingCharacter {

    public static void firstNonRepeat(String input){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(char c : input.toCharArray()){
            if(hashMap.containsKey(c)){
                hashMap.put(c, hashMap.get(c)+1);
            }
            else{
                hashMap.put(c,1);
            }
        }

        System.out.println(hashMap);

        for(char c : hashMap.keySet()){
            if(hashMap.get(c)==1)
            {
                System.out.println(c);
                break;
            }
        }
    }


    public static void main(String[] args) {

        firstNonRepeat("swiss");
    }
}
