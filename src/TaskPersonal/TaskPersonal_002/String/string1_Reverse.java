package TaskPersonal.TaskPersonal_002.String;

import java.util.Scanner;

public class string1_Reverse {
    //Java Program to reverse a String


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.next();
        System.out.println("String is "+ name);
        int length = name.length();
        String rev = "";

        for(int i = name.length()-1; i>=0; i--)
        {
             rev = rev + name.charAt(i);
        }

        System.out.println(rev);




    }
}
