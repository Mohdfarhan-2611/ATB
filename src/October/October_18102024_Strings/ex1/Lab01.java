package October.October_18102024_Strings.ex1;

public class Lab01 {
    public static void main(String[] args) {

        char ch = 'A';
        //String contains sequence of characters

        //SCP - String Constant Pool
        String s1 = "Farhan"; // create name Farhan in SCP and s1 refer to it.
        String s2 = "Farhan"; // do not create new name in SCP,now s2 refer to Farhan instead of s1

        //Heap Area
        String s3 = new String("Anam"); //creates a new object s3 in Heap Area
        String s4 = new String("Anam"); //creates a new object s4 in Heap Area
        String s5 = new String("Farhan"); //create a new object s5 in Heap Area
        String s6 = new String("farhan");


        System.out.println(s1==s2); //compares reference location of s1 & s2 which is same in SCP
        System.out.println(s3==s4); //compares reference location of S3 & s4 which is diff. in heap area
        System.out.println(s1==s5); //compares reference location of s1 & s5 which is diff in SCP & heap area

        System.out.println(s1.equals(s2)); //compares value which is same
        System.out.println(s3.equals(s4)); //compares value which is same
        System.out.println(s1.equals(s5)); //compares value which is same
        System.out.println(s5.equalsIgnoreCase(s6));

    }
}
