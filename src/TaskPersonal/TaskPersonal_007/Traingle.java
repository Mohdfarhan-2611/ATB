package TaskPersonal.TaskPersonal_007;

import java.util.Scanner;

public class Traingle {

    public static void main(String[] args) {

        //2 side are equal == isosceles
        //3 sides are eqil == equalateral
        //all different  == Normal Trianle

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Side1");
        int Side1 = sc1.nextInt();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Side2");
        int Side2 = sc2.nextInt();

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter the Side3");
        int Side3 = sc3.nextInt();


        if(Side1==Side2 && Side2 == Side3 && Side3 == Side1)
        {
            System.out.println("Equilateral triangle");
        }
        else if (Side1==Side2 || Side2==Side3 || Side1==Side3)
        {
            System.out.println("Isosceles Triangle");
        }
        else
        {
            System.out.println("Sacelene Triangle");
        }




    }
}
