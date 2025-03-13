package Coding5_Stringpractice;

public class SubStringOccurence {

    public static void occurrenceSubstring(String input){
        int count = 0;

        if("abc".indexOf(input)!=-1){
            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) {

        occurrenceSubstring("abababa");
    }
}
