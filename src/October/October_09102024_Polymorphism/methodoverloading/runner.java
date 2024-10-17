package October.October_09102024_Polymorphism.methodoverloading;

public class runner {
    public static void main(String[] args) {

        MathOperations m = new MathOperations();

        int result = m.add(3,4);
        System.out.println(result);

        String name = m.add("Moh","farhan", "saifi");
        System.out.println(name);
    }
}
