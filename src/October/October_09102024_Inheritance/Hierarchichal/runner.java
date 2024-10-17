package October.October_09102024_Inheritance.Hierarchichal;

public class runner {

    public static void main(String[] args) {

        Daughter d = new Daughter();
        System.out.println(d.daughter);
        d.daughter_m();
        d.daughter_m();
        System.out.println(d.father_name);

        Son1 s1 = new Son1();
        System.out.println(s1.father_name);
        s1.son1_m();
        s1.father_m();
        System.out.println(s1.son1);

        Son2 s2 = new Son2();
        System.out.println(s2.father_name);
        System.out.println(s2.son2);
        s2.son2_m();
        s2.father_m();
    }
}
