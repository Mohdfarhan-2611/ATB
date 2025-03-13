package Coding4;

public class String5_CountNumberOfWords {

    public static void countNumberOfWords(String input){
        String[] StrArray = input.split(" ");

        int count = 0;
        for(String s: StrArray) {
            count++;
        }
        System.out.println(count);
    }


    public static void main(String[] args){

        countNumberOfWords("Java is good progrmming");

    }
}
