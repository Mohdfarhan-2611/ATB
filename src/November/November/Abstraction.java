package November.November;

abstract class abc
{
    int a = 10;         //non static variable
    static int  b = 20; //Static
    final int c = 30;   //final
    abc()               //default constructor
    {
        System.out.println("abc");
    }
    abc(int a, int b)    //non default constructor
    {
        this.a=a;
        this.b=b;
    }
    public static void m4()       //Static method
    {
        System.out.println("Static implemented method");
    }
    public abstract void m1();        //abstract method
    public abstract void m2();        //abstract method
    public void m3()                 // non abstract method
    {
        System.out.println("I am m3");
    }
}





abstract public class Abstraction  {


//    public void m1() {
//        System.out.println("I am m1");
//    }


    public static void m2() {
        System.out.println("I am m2");
    }


    public static void main(String[] args) {

       m2();




    }
}
