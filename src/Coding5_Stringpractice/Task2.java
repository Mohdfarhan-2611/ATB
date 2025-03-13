package Coding5_Stringpractice;

public class Task2 {

    public static boolean reverse(String input){

        StringBuilder sb = new StringBuilder();
        String reverse = String.valueOf(sb.append(input).reverse());

        if(reverse.equals(input)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = reverse("Output");
        System.out.println(result);

    }
}
