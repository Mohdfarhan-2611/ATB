package October.October_25102024_Arrays.ex3;

import java.util.Scanner;

public class star5 {
    public static void main(String[] args) {

        Scanner s_5 = new Scanner(System.in);
        System.out.println("Enter the number");
        int n_5 = s_5.nextInt();

        for(int i= n_5; i>=1; i--)
        {
            for(int k=n_5-1; k>=i; k--)
            {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
