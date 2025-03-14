package A_StringsMethods;

public class ReplaceVowels {

    public static void main(String[] args) {
        String input = "FareEhiaonu";
        String vowels = "aeiou";
        StringBuilder sb  = new StringBuilder();
        for(char c : input.toLowerCase().toCharArray())
        {
            if(vowels.indexOf(c)==-1){
                sb.append(c);
            }
            else{
                sb.append("*");
            }
        }

        System.out.println(String.valueOf(sb));



        String result = input.replaceAll("[aeiouAEIOU]", "*");
        System.out.println(result);

    }
}
