package Task.Task_14102024.Inter;

public class PrintMyBook2 implements Runner.Book {
    String name;
    String author;
    int price;

    @Override
    public void getDetails() {
        System.out.println(name+","+author+","+price);
    }

    public PrintMyBook2(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
        getDetails();
    }
}
