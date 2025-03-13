package Coding4;

import java.util.LinkedHashSet;
import java.util.Set;

public class Strinh10_UniqueCharacter {

    public static void uniqueCharacter(String input) {
        char[] inputArray = input.toCharArray();
        Set<Character> linkedset = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char c: inputArray) {
            linkedset.add(c);
        }

        for(char c : linkedset)
        {
            sb.append(c);
        }

        System.out.println(sb.toString());



    }

    public static void main(String[] args) {

        uniqueCharacter("Java Automation");

    }
}
