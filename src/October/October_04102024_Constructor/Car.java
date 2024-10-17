package October.October_04102024_Constructor;

public class Car {

    String name;
    String color;
    int seats;
    String Engine;

    Car()
    {
        System.out.println("This is default constructor");
    }

    Car(String name)
    {
        System.out.println("This is first parameterized constructor");
        this.name = name;
    }

    Car(String name, String color, int seats, String engine)
    {
        System.out.println("This is second parameterized constructor");
        this.name = name;
        this.color = color;
        this.seats = seats;
        this.Engine = engine;
    }
}
