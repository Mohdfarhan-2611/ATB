package October.October_25102024_Arrays.ex2;

import java.util.Scanner;

public class star1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = s.nextInt();

        for(int row=1; row<=n; row++)
        {
            for(int col=1; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
