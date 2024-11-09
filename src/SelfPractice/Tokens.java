package SelfPractice;

public class Tokens {

    public static void main(String[] args) {

        //All blue highligted are Keywords
        //package
        int a = 10;
        //int is keyword
        String abc = "Farhan";
        //String is not a keyword
        // a , abc are the identifiers
        //10, Farhan are the Literals



       // int a = 10;
        //boolean name = true;

        for(int i =1; i<=10; i++)
        {
            System.out.println(i);
            if(i==5)
            {
                System.out.println("I am checking continue");
                continue;
            }
            if(i==6)
            {
                System.out.println("I am chcking 6");
            }

            System.out.println("I am outside if condition");
        }

        System.out.println("I am outside for loop");




    }
}
