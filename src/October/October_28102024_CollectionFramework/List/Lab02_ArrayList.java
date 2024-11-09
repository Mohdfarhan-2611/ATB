package October.October_28102024_CollectionFramework.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab02_ArrayList {

    public static void main(String[] args) {

        List l1 = new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(1);

        System.out.println(l1);
        System.out.println(l1.size());
        System.out.println(l1.contains(2));
        System.out.println(l1.indexOf(1));
        System.out.println(l1.indexOf(2));
        System.out.println(l1.indexOf(3));
        System.out.println(l1.lastIndexOf(1));

        Collections.sort(l1);
        System.out.println(l1);


        for(int i=0; i<l1.size(); i++) {
            System.out.println(l1.get(i));
        }

        for(Object o : l1)
        {
            System.out.println(o);
        }



    }
}
