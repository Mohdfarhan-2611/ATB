package October.October_25102024_Arrays.ex3;

import java.util.Scanner;

public class star1 {
    public static void main(String[] args) {

        Scanner s_1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int num_1 = s_1.nextInt();


        for(int i=1; i<=num_1; i++)
        {
            int count =i;
            for(int j=1; j<=i; j++)
            {
                System.out.print(count);
                count--;
            }
            System.out.println();
        }
    }
}
