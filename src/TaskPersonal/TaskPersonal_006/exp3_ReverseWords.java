package TaskPersonal.TaskPersonal_006;

public class exp3_ReverseWords {

    public static void main(String[] args) {

        ReverseWords(" Farhan knows Java");
    }

    static void ReverseWords(String inputString)
    {
        String[] words = inputString.split(" ");
        String reverse = "";

        for(int i =words.length-1; i>=0; i--)
        {
            reverse = reverse + " " +words[i];
        }

        System.out.println(reverse.trim());
    }
}
