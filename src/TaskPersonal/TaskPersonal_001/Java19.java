package TaskPersonal.TaskPersonal_001;

import java.util.HashMap;

public class Java19 {

    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();

        map1.put("Farhan",1);
        map1.put("Tayyab",2);
        map1.put("Asir",3);

        map1.containsKey("Farhan");

        System.out.println( map1.get("Farhan"));


    }
}
