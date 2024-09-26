package Sept.Sept_25092024;

public class ForLoop14 {
    public static void main(String[] args) {
        //print the values of even and odd number between 0 to 5
        for(int i=0; i<=50; i++)
        {
            if(i%2==0)
            {
                System.out.println("Even" +" "+ i);
                continue;
            }
            System.out.println(i);
        }

    }
}
