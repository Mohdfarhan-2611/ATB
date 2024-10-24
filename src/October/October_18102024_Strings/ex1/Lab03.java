package October.October_18102024_Strings.ex1;

import java.nio.charset.StandardCharsets;

public class Lab03 {
    public static void main(String[] args) {
        //Functions

        //Length    //01234567891011
        String str = " Pramod Dutta ";
        System.out.println("Length "+str.length());

        //SubString
        System.out.println("substring is "+ str.substring(0,12));

        //trim
        System.out.println(str.trim());

        //upperCase , lowercase
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());

        //indexof
        System.out.println(str.indexOf('P'));

        //charAt
        System.out.println(str.charAt(9));

        //Contains
        System.out.println(str.contains("P"));

        //endswith
        System.out.println(str.endsWith("ta "));

        //startwith
        System.out.println(str.startsWith(" Pra"));

        //isEmpty
        System.out.println(str.isEmpty());

        //replace
        System.out.println(str.replace('P','T'));

        //to charArray
        System.out.println(str.toCharArray());








    }
}
