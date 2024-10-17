package October.October_04102024_Constructor;

public class Dog {

    String name;
    int age;
    int legs;
    String breed;

    Dog()
    {
        System.out.println("This is Default Constructor");
    }

    Dog(String breed)
    {
        System.out.println("This is parameterized constructor");
        this.breed = breed;

    }

    Dog(String name, String breed, int age, int legs)
    {
        System.out.println("This is parameterized constructor");
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.legs = legs;

    }

}
