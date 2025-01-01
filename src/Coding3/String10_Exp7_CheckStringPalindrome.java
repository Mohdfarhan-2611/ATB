package Coding3;

public class String10_Exp7_CheckStringPalindrome {

    static String ReverseString(String input)
    {
        //input = input.toLowerCase();
        String Reverse = "";
        for(int i= input.length()-1; i>=0; i--)
        {
            Reverse = Reverse + input.charAt(i);
        }

        return Reverse;
    }

    public static void main(String[] args) {

        String result = ReverseString("Madam");
        if(result.equalsIgnoreCase("Madam"))
            System.out.println("it is Palindrome");
        else
            System.out.println("Not Palindrom");

    }
}
