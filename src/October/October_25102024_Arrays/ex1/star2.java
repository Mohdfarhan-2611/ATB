package October.October_25102024_Arrays.ex1;

public class star2 {

    public static void main(String[] args) {
//        *****
//        ****
//        ***
//        **
//        *


        int n = 5;

        for(int i=1; i<=n; i++)
        {
            for(int j=n; j>=i; j--)  //5 //5
            {
                 System.out.print("*");
            }
            System.out.println();
        }


    }
}
