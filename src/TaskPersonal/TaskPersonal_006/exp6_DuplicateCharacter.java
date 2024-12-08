package TaskPersonal.TaskPersonal_006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class exp6_DuplicateCharacter {

    public static void main(String[] args) {

        DuplicateCharacter("Automation");
    }

    public static void DuplicateCharacter(String inputString) {
        char[] ch = inputString.toCharArray();
        System.out.println(ch);
        HashSet<Character> set1 = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : ch)
        {
            char lowercase = Character.toLowerCase(c);
            if(!set1.contains(lowercase))
            {
                set1.add(lowercase);
                result.append(lowercase);
            }
        }


        System.out.println(result);

    }

}

