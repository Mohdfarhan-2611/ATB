package Task.Task_25092024;

public class Task3_Prime {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++)
        {
           // System.out.println(i/2); //Quotient
            // System.out.println(i%2); //remainder
            if(i==2)
            {
                System.out.println(i + " prime");
            }
            else
            {
                for (int j = 2; j < i; j++)
                {

                    if (i % j == 0)
                    {
                        break;
                    }
                    else if(j==i-1)
                    {
                        System.out.println(i + " prime");
                    }

                }




            }




        }

    }
}
