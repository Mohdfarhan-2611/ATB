package Coding;

public class CheckPangram {

    public static void main(String[] args) {

        String input = "The quick brown for jumps over the lazy do";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String lowercaseinput = input.toLowerCase();

        if(lowercaseinput.length()>=26)
        {
            for(int i=0; i<=lowercaseinput.length()-1; i++)
            {
                if(alphabet.indexOf(lowercaseinput.charAt(i))>0)
                {
                    //System.out.println("pangram");
                    continue;
                }
                else
                {
                    System.out.println("Not Pangram");
                    break;
                }
            }
        }
    }
}
