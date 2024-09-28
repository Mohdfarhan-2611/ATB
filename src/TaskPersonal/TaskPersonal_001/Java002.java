package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Java002 {
    public static void main(String[] args) {
        //write a program to print all natural numbers from 1 to n

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++)
        {
            System.out.println(i);
        }




    }
}
