package October.October_25102024_Arrays.ex2;

import java.util.Scanner;

public class star2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = s.nextInt();

        for(int row=num; row>=1; row--)
        {
            for(int col =1; col<=row; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
