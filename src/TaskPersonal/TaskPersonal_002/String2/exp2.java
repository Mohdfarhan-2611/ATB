package TaskPersonal.TaskPersonal_002.String2;

public class exp2 {

    static void reverseWords(String inputString)
    {
        String[] words = inputString.split(" ");
        String reverse = "";
        int length = words.length;

        for(int i=length-1; i>=0; i--)
        {
            reverse = reverse + " "+ words[i];
        }

        System.out.println(reverse.trim());

    }

    public static void main(String[] args) {

        reverseWords("Java is a good programming language");
    }
}
