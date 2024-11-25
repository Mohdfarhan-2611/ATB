package TaskPersonal.TaskPersonal_006;

public class exp4_Wordscount {

    public static void main(String[] args) {

        WordsCount("Farhan knows Java completely");
    }

    static void WordsCount(String inputString)
    {
        String[] words = inputString.split(" ");
        int count = 0;

        for(String word : words)
        {
            count++;
        }

        System.out.println(count);
    }
}
