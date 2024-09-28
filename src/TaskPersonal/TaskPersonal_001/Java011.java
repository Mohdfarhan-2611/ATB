package TaskPersonal.TaskPersonal_001;

public class Java011 {
    public static void main(String[] args) {
        // write a program to reverse the given Digits
        int n = 12345;
        int rem = 0;
        int rev = 0;

        for(int i = 1; n>0; i++)
        {
            rem = n%10;
            n = n/10;
            rev = 10 * rev + rem;
        }

        System.out.println(rev);
    }
}
