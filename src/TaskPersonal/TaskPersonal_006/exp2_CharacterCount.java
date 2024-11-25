package TaskPersonal.TaskPersonal_006;

public class exp2_CharacterCount {

    public static void main(String[] args) {

        CharacterCount("Farhan is Good Boy");
    }

    static void CharacterCount(String inputString)
    {
        String[] words = inputString.split(" ");
        int count = 0;
        for(String word : words)
        {
            for (int i = 1; i <=word.length() ; i++) {
                count++;
            }
        }

        System.out.println(count);
    }
}
