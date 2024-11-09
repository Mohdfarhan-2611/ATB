package TaskPersonal.TaskPersonal_002.String2;

import java.util.HashMap;

public class Map {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Farhan",1);
        map1.put("Tayyab",2);
        boolean b1 = map1.containsKey("Farhan");
        boolean b2 = map1.containsKey(3);


        System.out.println(map1);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(map1.keySet());
        System.out.println(map1.containsValue(1));
        System.out.println(map1.containsValue(3));
        System.out.println(map1.replace("Farhan", 5));
        System.out.println(map1);
        System.out.println(map1.get("Farhan")+1);
        System.out.println(map1.get("Tayyab"));

    }
}
