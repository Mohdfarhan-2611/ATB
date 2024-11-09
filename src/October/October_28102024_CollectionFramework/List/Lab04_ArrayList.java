package October.October_28102024_CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab04_ArrayList {

    public static void main(String[] args) {

        List l4 = new ArrayList();
        //add method comes from Collection I
        l4.add(1);
        l4.add(2);
        l4.add(3);
        l4.add(4);

        System.out.println(l4);
        //add(int index, Object o) comes from List Interface

        l4.add(0,0);
        System.out.println(l4);
        System.out.println(l4.indexOf(0));
    }
}
