package SelfPractice;

public class classone {

    int a = 10;
    String name = "Farhan";
    boolean isauth = true;
    int b = 20;


    public void check(int num, String abc, boolean cond)
    {
        this.a= num;
        this.name = abc;
        this.isauth = cond;

        System.out.println(a);
        System.out.println(name);
        System.out.println(isauth);
    }

    public void check1()
    {
        int c = a+b;
    }


    public static void main(String[] args) {

        classone obj = new classone();
        obj.check(123, "Naveen", false);
        obj.a = 1234;
        System.out.println(obj.a);

    }
}
