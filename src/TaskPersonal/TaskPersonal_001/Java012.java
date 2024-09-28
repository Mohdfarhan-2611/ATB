package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Java012 {
    public static void main(String[] args) {
        //Write a Program to Check Given Number is a Palindrome or Not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int num2 = num;
        int rem = 0;
        int rev = 0;

        for(int i = 1; num>0; i++)
        {
            rem = num % 10; //1, 1 , 1
            num = num/10;   //11, 1 , 0
            rev = 10 * rev + rem;  //1, 11, //111
        }
        System.out.println(rev);

        if(num2==rev)
        {
            System.out.println("Number is palindrome");
        }
        else {
            System.out.println("Number is not palindrome");
        }
    }
}
