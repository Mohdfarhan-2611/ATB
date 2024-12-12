package November.November2;

public class Stringexp2
{
    public static void Reverse_words(String inputString)
    {
        String[] words = inputString.split(" ");
        String reverse = " ";

            for(int i =words.length-1; i>=0; i--)
            {
                reverse = reverse + " "+ words[i];
            }

        System.out.println(reverse.trim());
    }

    public static void main(String[] args) {

        Reverse_words("Hello how are you");
    }
}
