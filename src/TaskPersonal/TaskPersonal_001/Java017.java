package TaskPersonal.TaskPersonal_001;

public class Java017 {
    public static void main(String[] args) {
        //Write Java program to Print Fibonacci Series

        int n1 = 0;          //0
        int n2 = 1;          //1
        int n3;
        int count = 10;

        System.out.println(n1);
        System.out.println(n2);
        for(int i=0; i<=count; i++)
        {
            n3 = n1 +n2;       //1   //
            System.out.print(" "+n3+" ");
            n1 = n2;   //1 2
            n2 = n3;  //1  2
        }
                                  //0   1   1    2
                                  //n1  n2  n3
    }                             //     n1  n2  n3
}                                 //         n1  n2
