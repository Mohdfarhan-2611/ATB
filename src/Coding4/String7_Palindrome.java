package Coding4;

public class String7_Palindrome {

    public static boolean palindrome(String input){
        int length = input.length();
        String reverse= "";
        for(int i=length-1; i>=0; i--){

            reverse = reverse + input.charAt(i);
        }
        if(input.equalsIgnoreCase(reverse)){
            return true;
        }

        return false;
    }


    public static void main(String[] args) {

       boolean isPalindrome= palindrome("madam");
       System.out.println(isPalindrome);
    }

}
