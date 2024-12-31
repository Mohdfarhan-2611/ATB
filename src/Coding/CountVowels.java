package Coding;

public class CountVowels {
    public static void main(String[] args) {

        String input = "Hello";
        String vowels = "aeiouAEIOU";
        int count = 0;

        for(int i=0; i<input.length(); i++)
        {
          if(vowels.indexOf(input.charAt(i))!=-1)
          {
              count++;
          }
        }

        System.out.println(count);
    }

}
