package A_StringsMethods;

import java.util.ArrayList;
import java.util.List;

public class String6_valueOf {
    public static void main(String[] args) {
        String name = "Farhan";
        int a = 23;

        List<Integer> age = new ArrayList<>();
        age.add(20);
        age.add(30);

        StringBuilder stringBuilder = new StringBuilder("FarhanSB");
        System.out.println(String.valueOf(stringBuilder));

    }
}
