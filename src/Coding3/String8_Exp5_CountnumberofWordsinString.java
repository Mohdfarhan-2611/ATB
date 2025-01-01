package Coding3;

public class String8_Exp5_CountnumberofWordsinString {

    public static int countWords(String input)
    {
        int count=0;
        String[] inputArray = input.split(" ");

        for(String s : inputArray)
        {
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
       int noofwords =  countWords("Welcome to Java Automation World");
       System.out.println("words in String are: "+noofwords);
    }
}
