package Coding4;

import java.util.HashMap;

public class OccurenceOfWords {

    public static void occurenceOfWords(String input){
        String[] inputArray = input.split(" ");
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : inputArray) {
            if(hashMap.containsKey(s)){
                hashMap.put(s, hashMap.get(s)+1);
            }
            else {
                hashMap.put(s,1);
            }
        }

        System.out.println(hashMap);

    }

    public static void main(String[] args) {

        occurenceOfWords("Java is good programming");
    }
}
