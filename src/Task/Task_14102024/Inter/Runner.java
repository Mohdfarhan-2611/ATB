package Task.Task_14102024.Inter;

public class Runner {

    public static void main(String[] args) {
        Book b = new PrintMyBook2("Harry Potter", "JK Rolling", 120);

    }



    interface Book{
        void getDetails();

    }
}
