package October.October_25102024_Arrays.ex2;

import java.util.Scanner;

public class star4 {
    public static void main(String[] args) {

        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = s2.nextInt();

        for(int i=1; i<=num; i++) //2
        {
            for(int j=num-1; j>=i; j--) //4  4>=2, 3>=2, 2>=2
            {
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++)   // 1   1<=2 2<=2
            {
                System.out.print("*");      //*
            }

            System.out.println();
        }

    }
}
