package October.October_21102024_Wrapper.ex1;

import java.util.ArrayList;
import java.util.List;

public class Lab01<T> {

   // int name;
   // Object name;
    T name;

    public static void main(String[] args) {

        Lab01<Integer> obj = new Lab01<>();
        obj.name= 123;
       // obj.name = "yahya";
        System.out.println(obj.name);

        Lab01<String> obj2 = new Lab01<>();
        obj2.name = "Yahya";
        System.out.println(obj2.name);





    }
}
