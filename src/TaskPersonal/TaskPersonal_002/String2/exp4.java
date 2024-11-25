package TaskPersonal.TaskPersonal_002.String2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class exp4 {

    public static void main(String[] args) {

        countCharacters("Java is a good programmmmmmming language");
    }


    static void countCharacters(String inputString)
    {
        char[] ch = inputString.toCharArray();
        HashMap<Character, Integer> charactersCount = new HashMap<>();

        for(Character c : ch)
        {
            if(c != ' ') {
                if (charactersCount.containsKey(c)) {
                    charactersCount.put(c, charactersCount.get(c) + 1);
                } else {
                    charactersCount.put(c, 1);
                }
            }
        }
        System.out.println(charactersCount);

        Set<Character> characSet = charactersCount.keySet();

        System.out.println(characSet);
        char highestChar = ' ';
        int  highestCount = 0;

        for(Character c : characSet)
        {
            if(charactersCount.get(c)>highestCount)
            {
                highestCount = charactersCount.get(c);
                highestChar = c;
            }
        }

        System.out.println(highestChar + ":" + highestCount);


     }
}
