package Coding4;

public class String11_EvenIndexedCharacter {

    public static void evenIndexedCharacter(String input){
        char[] inputArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();


        for(int i=0; i<inputArray.length; i++)
        {
            if(i%2==0){
                sb.append(inputArray[i]);
            }
        }
        System.out.println(sb.toString());
    }


    public static void main(String[] args) {

        evenIndexedCharacter("Automation");
    }
}
