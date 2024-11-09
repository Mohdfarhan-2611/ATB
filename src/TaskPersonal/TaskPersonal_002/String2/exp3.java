package TaskPersonal.TaskPersonal_002.String2;

import java.util.HashMap;

public class exp3 {

    static void countWords(String inputString)
    {
        HashMap<String, Integer> map1 = new HashMap<>();
        String[] words = inputString.split(" ");

        for(String word : words)
        {
            if(map1.containsKey(word))
            {
                map1.put(word, map1.get(word)+1);
            }
            else
            {
                map1.put(word,1);
            }
        }

        System.out.println(map1);

    }

    public static void main(String[] args) {

        countWords("Java is a good good programming");
    }
}
