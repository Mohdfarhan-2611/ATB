package October.October_25102024_Arrays.ex3;

import java.util.Scanner;

public class star3 {
    public static void main(String[] args) {
        Scanner s_3 = new Scanner(System.in);
        System.out.println("Enter the number");
        int num_3 = s_3.nextInt();
        int num_4 = num_3-1;

        for(int i=1; i<=num_3; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=num_4; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
