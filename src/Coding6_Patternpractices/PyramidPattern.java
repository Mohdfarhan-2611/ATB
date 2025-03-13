package Coding6_Patternpractices;

public class PyramidPattern {

    public static void main(String[] args) {
        int num = 5;
        for (int i = 1; i <= num; i++) {
            // Print leading spaces
            for (int j = num; j > i; j--) {
                System.out.print(" "); // Double space for better alignment
            }
            // Print numbers in pyramid format
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  "); // Extra spaces for better alignment
            }
            System.out.println();
        }
    }
}


