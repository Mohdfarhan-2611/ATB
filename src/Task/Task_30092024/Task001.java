package Task.Task_30092024;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {

        System.out.println("Enter Number....");
        Scanner n=new Scanner(System.in);
        int user= n.nextInt();
        int fact=1;
        for(int i=1; i<=user; i++ ){
            fact*=i;
        }
        System.out.println(fact);



    }
}
