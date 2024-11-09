package October.October_25102024_Arrays.ex3;

import java.util.Scanner;

public class star4 {
    public static void main(String[] args) {

        Scanner s_4 = new Scanner(System.in);
        System.out.println("Enter the number");
        int num_4 = s_4.nextInt();

        for(int i=1; i<=num_4; i++)
        {
            for(int j=num_4-1; j>=i; j--)
            {
                System.out.print(" ");
            }

            for(int k=1; k<=i; k++)
            {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
