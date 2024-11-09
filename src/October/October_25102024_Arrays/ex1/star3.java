package October.October_25102024_Arrays.ex1;

public class star3 {
    public static void main(String[] args) {

        int n = 5;
        int m = 4;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++ )
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=m; i++)
        {
            for(int j=m; j>=i; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
