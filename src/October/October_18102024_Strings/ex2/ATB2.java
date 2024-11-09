package October.October_18102024_Strings.ex2;

public class ATB2 {
    public static void main(String[] args) {

        String s = "Farhan is Good";
        //split
        String[] words = s.split(" ");

        //length of string or string array
        System.out.println(words.length);

        //print each word for string array
        for(int i=0; i<= words.length-1; i++)
        {
            System.out.println(words[i]);
        }

        for(String word: words)
        {
            System.out.println(word);
        }

    }
}
