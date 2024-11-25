package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Prime1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int factorial=0;

        for (int i = 1; i <= number; i++)
        {
            factorial =0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    factorial++;
                }

            }
            if(factorial==2)
            {
                    System.out.println(i + " is a prime");
            }
            else
            {
                System.out.println(i + " is not a prime");
            }

            }

        }

    }

