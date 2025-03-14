package Coding;

public class CheckPangram {

    public static void main(String[] args) {

        String input = "Pack my box with five dozen liquor jugs";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String lowercaseinput = input.toLowerCase();
        int count=0;

        if(lowercaseinput.length()>=26)
        {
            for(char c : alphabet.toCharArray()){
                if(lowercaseinput.indexOf(c)==-1){
                    System.out.println("Not Pangram");
                }
                else{
                    count++;
                }
            }
        }
        else{
            System.out.println("not pangram");
        }

        if(count==26){
            System.out.println("Pangram");
        }
        else{
            System.out.println("Not Pangram");
        }

    }
}
