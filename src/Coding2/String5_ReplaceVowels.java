package Coding2;

public class String5_ReplaceVowels {

    public static boolean isVowel(Character c)
    {
        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
          return true;
        else
            return false;
    }

    public static void main(String[] args) {

        String input = "Name"; //a e are the vowels both should get replaced with x
        //output = nxmx;
        input = input.toLowerCase();
        char[] inputArray = input.toCharArray();
        String vowels = "aeiou";
        StringBuilder sb = new StringBuilder();


        for (char c : inputArray)
        {
            if (isVowel(c)) {
                sb.append('x');
            } else {
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
    }
}