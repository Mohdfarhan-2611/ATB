package Task.Task_02102024;

public class Task002 {
    //Create a class ATB students and 5 objects (A/B)

    String FirstName;
    String LastName;
    int rollNo;
    String city;

    String Name(){
        System.out.println("Name of students");
        return FirstName;
    }

    public static void main(String[] args) {

        Task002  student1 = new Task002();
        student1.FirstName = "Farhan";
        student1.LastName = "Anam";
        student1.rollNo= 1;
        student1.city = "Kasganj";



    }
}
