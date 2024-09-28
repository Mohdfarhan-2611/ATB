package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Java009 {
    public static void main(String[] args) {
    //Write a program to find sum of all even numbers between 1 to n

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int sum = 0;

        for(int i=0; i<=n; i++)
        {
            if(i%2==0)
            {
                sum = sum + i;
            }
        }

        System.out.println(sum);
    }
}
