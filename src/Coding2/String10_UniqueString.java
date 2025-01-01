package Coding2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class String10_UniqueString {

    public static void main(String[] args) {

        String input = "Java Automation"; //output: Jav Automin
        char[] inputArray = input.toCharArray();
        LinkedHashSet<Character> hashSet = new LinkedHashSet<>();

        for(char c : inputArray)
        {
            if(hashSet.contains(c) || c == ' ')
            {
                continue;
            }
            else
            {
                hashSet.add(c);
            }
        }

        System.out.println(hashSet.stream().map(String::valueOf).collect(Collectors.joining()));



    }
}
