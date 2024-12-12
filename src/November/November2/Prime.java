package November.November2;

import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        // only two factorial
        //1 & itself

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int factorial = 0;

        for(int i=1; i<=num; i++)
        {
            factorial = 0;
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0)
                {
                    factorial++;
                }
            }

            if (factorial == 2) {
                System.out.println(i + " number is prime");
            } else {
                System.out.println(i + " number is not prime");
            }

        }

    }
}
