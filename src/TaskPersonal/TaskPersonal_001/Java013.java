package TaskPersonal.TaskPersonal_001;

import java.util.Scanner;

public class Java013 {
    public static void main(String[] args) {
        // Write a Program to check Armstrong numbers or Not

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        int number2 = number;
        int number3 = number;
        int c = 0;
        int last = 0;
        int arm1 = 1;
        int arm2 = 1;
        int arm3 = 1;
        int arm = 0;

        int i =0;
        while(number>0)
        {
            number = number/10;
            c++;
        }
        System.out.println(c);

        for(int x=1; x<=c; x++)
        {
            last = number2 % 10;
            arm1 = arm1 * last;
        }

        number2 = number2/10;

        for(int x=1; x<=c; x++)
        {
            last = number2 % 10;
            arm2 = arm2 * last;
        }

        number2 = number2/10;

        for(int x=1; x<=c; x++)
        {
            last = number2 % 10;
            arm3 = arm3 * last;
        }

        arm = arm1+arm2+arm3;
        System.out.println(arm);
        if(arm==number3)
        {
            System.out.println("Number is armstrong");
        }
        else{
            System.out.println("Number is not armstrong");
        }


    }
}
