package Coding4;

public class String12_RemoveSpaceFromString {

    public static void removeSpace(String input){
        String[] inputArray = input.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String s : inputArray)
        {
            sb.append(s);
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {

        removeSpace("Welcome to Java World");
    }
}
