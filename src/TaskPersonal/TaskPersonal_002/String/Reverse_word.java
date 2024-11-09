package TaskPersonal.TaskPersonal_002.String;

import java.util.Scanner;

public class Reverse_word {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string");
        String inputString = sc.nextLine();
        System.out.println("inputString is "+inputString);
        String[] words = inputString.split(" ");
        String rev =  "";
        int len = words.length;

        for(int i= words.length-1; i>=0; i--)
        {
            rev = rev + " "+ words[i];
        }

        System.out.println(rev.trim());



    }

}
