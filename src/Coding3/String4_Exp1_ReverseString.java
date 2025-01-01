package Coding3;

public class String4_Exp1_ReverseString {

    public static String ReverseString(String input)
    {
        String reverse = " ";
        for(int i= input.length(); i>0; i++)
        {
            reverse = reverse + input.charAt(i);
        }

        return reverse;
    }

    public static void main(String[] args) {

        String result = ReverseString("String");
        System.out.println(result);
    }
}
