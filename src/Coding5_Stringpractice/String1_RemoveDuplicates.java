package Coding5_Stringpractice;

import java.util.*;

public class String1_RemoveDuplicates {

    public static void removeDuplicates(String input){
//  =============================================================
//        char[] charArray = input.toCharArray();
//        Set<Character> set = new LinkedHashSet<>();
//        StringBuilder sb = new StringBuilder();
//        for(char c : charArray) {
//            set.add(c);
//        }
//
//        for (char c : set) {
//            sb.append(c);
//        }
//
//        System.out.println(sb.toString());

//============================================================================
//        StringBuilder sb = new StringBuilder();
//        boolean[] seen = new boolean[256];
//
//        for(char c : input.toCharArray()){
//            if(!seen[c] || c==' '){
//                sb.append(c);
//                seen[c]=true;
//            }
//        }
//
//        System.out.println(sb.toString());

//==========================================================================

        StringBuilder sb = new StringBuilder();
        HashMap<Character, Boolean> seen = new HashMap<>();

        for(char c : input.toCharArray()){
            if(!seen.containsKey(c) || c==' '){
                sb.append(c);
                seen.put(c,true);
            }
        }

        System.out.println(sb.toString());


    }

    public static void main(String[] args) {

        removeDuplicates("123 2225 2224");
    }
}
