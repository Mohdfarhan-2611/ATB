package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given number");
        int number = sc.nextInt();
        double factorial = 1;

        for(int i =1; i<=number; i++)
        {
            factorial = factorial * (1*i);
        }

        System.out.println("Fatorial of given number is "+ factorial);
    }
}
