package October.October_11102024_Encapsulation.Super.ex1;

public class Car extends Vehicle {

    private int maxSpeed = 280;

    Car(){
        super();  // Constructor Chaining
        System.out.println("DC -Car");
        System.out.println(this.maxSpeed);
        System.out.println(super.maxSpeed);
    }
}
