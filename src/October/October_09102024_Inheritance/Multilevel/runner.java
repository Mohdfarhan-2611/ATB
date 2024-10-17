package October.October_09102024_Inheritance.Multilevel;

public class runner {

    public static void main(String[] args) {

        Child c = new Child();
        System.out.println(c.Grandfather);
        System.out.println(c.Father);
        System.out.println(c.child);

        c.m_Grandfather();
        c.m_Father();
        c.m_child();

    }


}
