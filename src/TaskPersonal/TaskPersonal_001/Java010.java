package TaskPersonal.TaskPersonal_001;

public class Java010 {
    public static void main(String[] args) {
     //Write a program to find the value of one number raised to the power of another

        int n1 = 2;
        int n2 = 5;
        int out = 1;
        int value = 1;

        for(int i = 1; i<=n2; i++)
        {
            out =  out *n1;
           // value =  out * n1;
        }

        System.out.println(out);
    }
}
