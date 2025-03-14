package A_StringsMethods;

import java.sql.SQLOutput;

public class String3_indexOf {

    public static void main(String[] args) {

        String name = "Farhan";
        System.out.println(name.indexOf('F'));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf('A'));
        System.out.println(name.indexOf('h'));
        System.out.println(name.indexOf('R'));


        String vowels = "aeiou";
        System.out.println("Fullvowels are present or not");
        for (char c : vowels.toCharArray()) {
            if(name.indexOf(c)==-1){
                System.out.println("vowels not present "+c);
            }
            else {
                System.out.println("vowels present "+c);
            }
        }
    }
}
