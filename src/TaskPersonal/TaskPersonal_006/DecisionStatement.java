package TaskPersonal.TaskPersonal_006;

public class DecisionStatement {

    public static void main(String[] args) {

       int day=0;

       switch (day) {

           case 1 -> {System.out.println("Monday");
               System.out.println("Monday 2");
           }
           case 2 -> System.out.println("Tuesday");
           default -> System.out.println("Invalid day");
       }
    }
}
