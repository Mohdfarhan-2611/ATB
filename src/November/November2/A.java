package November.November2;

import TaskPersonal.ExceptionalHandling.AirthmaticException;

public class A {

    public static void main(String[] args)  {

       try{
           System.out.println("try block");
           throw new ArithmeticException();
       }
       catch (ArithmeticException e)
       {
           System.out.println(e.getMessage());
       }
       finally {
           try {

               int a = 10 / 0;
               throw new ArithmeticException();
           }
           catch (ArithmeticException e)
           {
               System.out.println("Finally catch");
           }
       }



    }
}
