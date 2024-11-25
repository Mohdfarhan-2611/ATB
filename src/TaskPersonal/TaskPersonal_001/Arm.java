package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Arm {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the given number");
        int number = sc.nextInt(); 
        int d = number;
        double armstrong = 0;
        int remainder = 0;
        int quotient = number;
        int digit = 0;

        for (int i=1; number>0; i++)
        {
            number = number/10;
            digit++;
        }

        System.out.println("digits are "+digit);

        for(int i = 1; quotient>0; i++)
        {
            remainder = quotient%10;
            quotient = quotient/10;

            armstrong = armstrong + Math.pow(remainder, digit);
        }

        if(d==armstrong)
        {
            System.out.println("number is armstrong");
        }










    }
}
