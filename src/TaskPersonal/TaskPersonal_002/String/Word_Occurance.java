package TaskPersonal.TaskPersonal_002.String;

import java.util.HashMap;

public class Word_Occurance {

    static void word_occurance(String inputStream)
    {
        String[] words = inputStream.split(" ");
        HashMap<String , Integer> count = new HashMap<>();
        for(String word : words)
        {
            if(count.containsKey(word))
            {
                count.put(word, count.get(word)+1);
            }
            else
            {
                count.put(word,1);
            }
        }
        System.out.println(count);
    }


    public static void main(String[] args) {

        word_occurance("Java is language of computer and it is easy");

    }
}
