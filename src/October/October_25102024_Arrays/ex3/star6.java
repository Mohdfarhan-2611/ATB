package October.October_25102024_Arrays.ex3;

import java.util.Scanner;

public class star6 {

    public static void main(String[] args) {

        Scanner s_6 = new Scanner(System.in);
        System.out.println("Enter the number");
        int n_6 = s_6.nextInt();

        for(int i=1; i<=n_6; i++)
        {
            for(int j=n_6-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=4; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(" ");
            }
            for(int k = n_6-1; k>=i; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
