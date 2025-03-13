package TaskPersonal.TaskPersonal_001;

public class Primenumber {

    public static void main(String[] args) {
        //logic of prime number is
        //number is divisible by 1 or itself
        // means it will have 2 factorials

        int num = 30;
        int factorial = 0;

        for (int i = 1; i<=num; i++)
        {
            factorial=0;
           for(int j = 1; j<=i; j++ )
           {
               if(i%j==0)
               {
                   factorial++;
               }
           }

            if(factorial==2)
            {
                System.out.println(i + ": it is prime number");
            }
            else
            {
                System.out.println(i + ": it is not a prime number");
            }

        }






    }
}
