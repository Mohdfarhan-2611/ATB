package Coding2;

import java.util.HashMap;

public class String9_FrequencyofString
{
    public static void main(String[] args) {

        String input = "men will be men";
        String[] inputArray = input.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for(String s: inputArray)
        {
            if(hashMap.containsKey(s))
            {
                hashMap.put(s , hashMap.get(s)+1);
            }
            else
            {
                hashMap.put(s, 1);
            }
        }

        for(String s : hashMap.keySet())
        {
            System.out.println(s + ":" +hashMap.get(s));
        }
    }
}
