package Task.Task_23092024;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {

        int num1 = 20;
        int num2 = 20;

        char ch  = '*';

        switch (ch)
        {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            default:
                System.out.println("Enter valid character");
                break;
        }

    }
}
