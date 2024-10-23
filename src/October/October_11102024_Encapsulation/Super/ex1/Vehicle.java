package October.October_11102024_Encapsulation.Super.ex1;

public class Vehicle {

    public int maxSpeed = 180;

    Vehicle(){
        System.out.println("DC Vehicle");
    }

    Vehicle(int a){
        System.out.println("PC Vehicle");
    }

    void message(){
        System.out.println("Hello world DC");
    }

    void message(int a){
        System.out.println("Hello World PC");
    }
}
