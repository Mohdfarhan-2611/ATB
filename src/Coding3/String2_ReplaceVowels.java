package Coding3;

public class String2_ReplaceVowels {

    public static boolean isVowel(Character c)
    {
        if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u')
            return  true;
        else
            return false;
    }

    public static String ReplaceVowels(String input)
    {
        char[] inputArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        for(Character c : inputArray)
        {
            if(isVowel(c))
            {
                sb.append('x');
            }
            else
            {
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

       String result =  ReplaceVowels("Hello");
       System.out.println(result);
    }
}
