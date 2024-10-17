package October.October_04102024_Constructor;

public class Person {

    String name;
    int age;
    String sex;
    boolean is_married;
    String disability;
    int hands;
    int legs;
    String eyes_color;
    String hair_color;
    String occupation;


    Person()
    {
        System.out.println("This is DC and No Return type No Parameter");
    }

    Person(String name)
    {
        System.out.println("This is PC with name");
        this.name = name;
    }

     Person(int age, int hands, int legs)
    {
        System.out.println("This is PC with int parameter");
        this.age = age;
        this.hands = hands;
        this.legs = legs;
    }

    Person(String sex, String disability, String eyes_color, String hair_color, String occupation)
    {
        System.out.println("This is PC with String parameter");
        this.sex = sex;
        this.disability = disability;
        this.eyes_color = eyes_color;
        this.hair_color = hair_color;
        this.occupation = occupation;
    }

    Person(boolean is_married)
    {
        System.out.println("This is PC with boolean parameter");
        this.is_married = is_married;
    }



}
