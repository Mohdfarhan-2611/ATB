package TaskPersonal.TaskPersonal_005.Overriding;

public class Child extends Parent {

    int eng = 10;
    int math= 20;

    @Override
    public int Calculation(int a, int b)
    {
        System.out.println("Subtraction: ");
        return eng-math;
    }

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.Calculation(2,3));


        Parent p = new Parent();
        System.out.println(p.Calculation(2,3));


    }
}
