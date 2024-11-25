package TaskPersonal.TaskPersonal_007;

import java.util.Scanner;

public class Palindrom {

    public static void main(String[] args) {

        //number == rever(number) Then the number will be considered as palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int number2 = number;
        int remainder =0;
        int reverse= 0;
        //How to reverse the number
        //123

        for( ; number>0; )
        {
            remainder = number%10;
            reverse = reverse *10 + remainder;
            number = number/10;
        }

        if(number2 == reverse)
        {
            System.out.println(number2 + " is a palindrome");
        }
        else
        {
            System.out.println(number2+" is not palindrom");
        }







    }
}
