package TaskPersonal.TaskPersonal_006;

import java.util.HashMap;

public class exp5_DuplicateWords {

    public static void main(String[] args) {

       Duplicate_Words("Java is Java Java is is is Java");
    }

     public static void Duplicate_Words(String inputString)
     {
        String[] words = inputString.split(" ");
        HashMap<String, Integer> map1 = new HashMap<>();
        int MaxminumCount = 0;
        String MaxWord = "";

        for(String word : words)
        {
            if(map1.containsKey(word))
            {
                map1.put(word, map1.get(word)+1);
            }
            else
            {
               map1.put(word, 1);
            }

            if(map1.get(word) > MaxminumCount)
            {
                MaxWord = word;
                MaxminumCount = map1.get(word);
            }
        }
         System.out.println(MaxWord + ":" + MaxminumCount);
     }
}
