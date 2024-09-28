package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Java008 {
    public static void main(String[] args) {
        //Write a program to find sum of all natural numbers between 1 to n
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;

        for(int i = 1; i<=n; i++)
        {
            sum = sum + i;
        }

        System.out.println(sum);


    }
}
