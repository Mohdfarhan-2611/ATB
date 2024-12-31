package Coding2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class String10_UniqueString {

    public static void main(String[] args) {

        String input = "Java Automation"; //output: Automin
        input = input.toLowerCase();
        String[] inputArray = input.split(" ");
   //     HashSet<Character> hashSet = new HashSet<>();
        ArrayList list = new ArrayList<>();

        for(String c : inputArray)
        {
            if(list.contains(c))
            {
                continue;
            }
            else
            {
                list.add(c);
            }
        }

        System.out.println(list.toString());


    }
}
