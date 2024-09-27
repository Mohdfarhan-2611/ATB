package Task.Task_25092024;

public class Task3_Prime {
    public static void main(String[] args) {

        for(int i=1; i<=100; i++)
        {
           // System.out.println(i/2); //Quotient
            // System.out.println(i%2); //remainder
            if(i<=1)
            {
                System.out.println(i);
            }
            else if(i==2)
            {
                System.out.println(i + " prime");
            }
            else if(i>=3)
            {
                for (int j = 2; j < i; j++)
                {

                    if (i % 1 == 0 && i % j == 0)
                    {
                        System.out.println(i);
                        break;
                    }

                }




            }




        }

    }
}
