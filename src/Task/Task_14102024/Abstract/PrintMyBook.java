package Task.Task_14102024.Abstract;

public class PrintMyBook extends Book {

    @Override
    void getDetails()
    {
        System.out.println(name +","+author+ ","+price);
    }

    public PrintMyBook(String name, String author, int price)
    {
        super.name = name;
        super.author = author;
        super.price = price;
    }
}
