package Task.Task_18092024;

public class Task1 {

    public static void main(String[] args) {

        //widening
        int a = 10;
        double b = a;          //Implicit : Widening : Valid : JVM will handle : No Loss
        double c = (double) a; //Explicit : Widening : Valid : JVM will handle : No Loss

        //Narrowing
        double d = 3.14;
     //   int i = d;          //Implicit : Narrowing : Invalid : JVM will not do
        int i = (int)d;       //Explicit : Narrowing : Invalid : JVM will do : but with Loss
        System.out.println(i);

    }
}
