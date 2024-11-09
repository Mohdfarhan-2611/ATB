package TaskPersonal.TaskPersonal_002.String;

import java.util.HashMap;
import java.util.Set;

public class duplicate_character {

    static void duplicateCharacter(String inputString)
    {
        char[] ch = inputString.toCharArray();
        HashMap<Character, Integer> countch = new HashMap<>();

        for(Character c : ch)
        {
            if(countch.containsKey(c))
            {
                countch.put(c, countch.get(c)+1);
            }
            else
            {
                countch.put(c, 1);
            }
        }

        System.out.println(countch);

        Set<Character> charInString = countch.keySet();
        System.out.println(charInString);
        System.out.println("Duplicate character in string :"+inputString);

        for(Character c : charInString)
        {
             if(c != ' ' && countch.get(c)>1)
             {
                 System.out.println(c + ":" + countch.get(c));
             }
        }


     }

    public static void main(String[] args) {

          duplicateCharacter("Farhan is a Good Employee");
    }
}
