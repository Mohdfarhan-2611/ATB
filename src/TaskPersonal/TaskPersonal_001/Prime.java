package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int factorial = 0;

        if(number>1)
        {
            for(int i=1; i<=number; i++)
            {
                if(number%i==0)
                {
                    factorial++;
                }
            }
            if(factorial==2)
            {
                System.out.println(number + " is a prime");
            }
            else
            {
                System.out.println(number + " is not prime");
            }

        }
        else{
            System.out.println(number + " is not prime");
        }
    }
}
