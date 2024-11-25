package TaskPersonal.TaskPersonal_005.Overloading;

public class Student {

    int eng = 10;
    int math =20;
    int sci = 30;

    public int Calculation(int a, int b)
    {
        System.out.println("Addition: ");
        return eng+math;
    }
    void Calculation()
    {
        System.out.println("Calculation: " );
    }

    public static void main(String[] args) {

        Student s = new Student();
        s.Calculation();
        System.out.println(s.Calculation(10,20));

    }
}
