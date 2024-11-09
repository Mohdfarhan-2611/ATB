package October.October_25102024_Arrays.ex3;

import java.util.Scanner;

public class star2 {

    public static void main(String[] args) {

        Scanner s_2 = new Scanner(System.in);
        System.out.println("Enter the number");
        int num_2 = s_2.nextInt();

        for(int i=num_2; i>=1; i--)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


}
