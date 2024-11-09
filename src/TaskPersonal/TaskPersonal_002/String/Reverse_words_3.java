package TaskPersonal.TaskPersonal_002.String;

public class Reverse_words_3 {

    static void reverse_words(String inputString)
    {
        String[] name = inputString.split(" ");
        String reverse = "";

        for(int i= name.length-1; i>=0; i--)
        {
            reverse = reverse + " " +name[i];
        }

        String reverseSentence = reverse.trim();
        System.out.println(reverseSentence);
    }

    public static void main(String[] args) {

        reverse_words("Java is a good programming language");
    }

}
