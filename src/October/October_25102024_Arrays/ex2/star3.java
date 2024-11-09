package October.October_25102024_Arrays.ex2;

import java.util.Scanner;

public class star3 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter your number");
        int num1 = s1.nextInt();
        int num2 = num1-1;

        for(int row1=1; row1<=num1; row1++)
        {
            for(int col1=1; col1<=row1; col1++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
       for (int row2=num2; row2>=1; row2--)
       {
         for(int col2=1; col2<=row2; col2++)
          {
             System.out.print("*");
          }
            System.out.println();
       }

    }
}
