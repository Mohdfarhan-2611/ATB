package Coding3;

public class String9_Exp6_PermutationofString {


    // Main method: the entry point of the program
    public static void main(String[] args) {
        String str = "abc"; // Input string to find permutations
        permute(str, "");   // Call the permutation method with the input string and an empty prefix
    }

    // Method to generate permutations of a string
    static void permute(String str, String prefix) {
        // Base case: if the input string is empty
        if (str.length() == 0) {
            System.out.println("Prefix: "+prefix); // Print the current permutation stored in 'prefix'
        } else {
            // Recursive case: iterate through each character in the string
            for (int i = 0; i < str.length(); i++) {
                // Get all characters except the one at position i
                System.out.println("i: "+i);
                System.out.println("First: "+str.substring(0,i));
                System.out.println("Second: "+str.substring(i+1));

                String rem = str.substring(0, i) + str.substring(i + 1);
                // Recursive call: append the current character to the prefix and permute the remaining string
                System.out.println("rem: "+rem);
                System.out.println("prefix: "+prefix+str.charAt(i));

                permute(rem, prefix + str.charAt(i));
            }
        }
    }
}


