package October.October_28102024_CollectionFramework.List;

import java.util.*;

public class Lab05_ArrayList {
    public static void main(String[] args) {

        ArrayList a1 = new ArrayList();
        a1.add(10);
        a1.add("Farhan");
        a1.add(10);
        a1.add(null);


        System.out.println(a1);
        System.out.println(a1.indexOf(10));
        System.out.println(a1.lastIndexOf(10));
        a1.remove(2);
        System.out.println(a1.indexOf(null));
        System.out.println(a1);
        a1.add(2,"Farhan");
        a1.add(10);
        System.out.println("----NonSynchronized List----");
        System.out.println(a1);

        List l = Collections.synchronizedList(a1);
        System.out.println("---Synchronized List----");
        System.out.println(l);







    }
}
