package Coding5_Stringpractice;


public class String2_Reverse {

    public static void reverseSingle(String input) {
        int length = input.length();
        String reverse = "";
        for(int i=length-1; i>=0; i--){
            reverse = reverse + input.charAt(i);
        }
        System.out.println(reverse);

    }

    public static void reverseWords(String input){
        String[] strArray = input.split(" ");
        String reverse = " ";
        int length = strArray.length;

        for(int i=length-1; i>=0; i--){
            reverse = reverse + strArray[i];
            reverse = reverse + " ";
        }

        System.out.println(reverse.trim());

    }

    public static void reverseWord(String input){
        String[] strArray = input.split(" ");
        StringBuilder sb = new StringBuilder();
        String reverse = " ";
        for(String s : strArray)
        {   reverse = reverse + " ";
            for(int i = s.length()-1; i>=0; i--)
            {
                reverse = reverse + s.charAt(i);
            }
        }
        sb.append(reverse.trim());
        System.out.println(sb);
    }

    public static void reverse(String input){
        String[] strArray = input.split(" ");
        String reverse = " ";
        String firstword = "";
        String secondword = "";
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<strArray.length; i++)
        {
            firstword = strArray[0];
            secondword = strArray[strArray.length-1];
        }
        for(int j=secondword.length()-1; j>=0; j--){
            reverse = reverse + secondword.charAt(j);
        }
        sb.append(firstword).append(reverse);
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {

        reverseSingle("Java"); //avaJ
        reverseWords("Java Programming"); //Programming Java
        reverseWord("Java Programming");  //avaJ gnimmargorP
        reverse("Java Programming"); //Java gnimmargorP
    }
}
