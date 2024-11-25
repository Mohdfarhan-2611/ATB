package TaskPersonal.TaskPersonal_007;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        //1,2,Fizz,4,Buzz  15(3&5) FizzBuzz
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int FinalNumber = sc.nextInt();

        int i = 1;
        while (i<=FinalNumber)
        {

            if (i%3==0)
            {
                System.out.println(i+" Fizz");
            }
            else if (i%5==0)
            {
                System.out.println(i+" Buzz");
            }
            else if(i%3==0 && i%5==0)
            {
                System.out.println(i+" FizzBuzz");
            }
            else
            {
                System.out.println(i);
            }
            i++;
        }







    }
}
