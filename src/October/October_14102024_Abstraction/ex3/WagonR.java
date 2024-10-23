package October.October_14102024_Abstraction.ex3;

public class WagonR extends Engine {

    void Drive(){
        startEngine();
        stopEngine();
    }

    @Override
    void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop Engine");
    }
}
