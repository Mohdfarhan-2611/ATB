package Coding5_Stringpractice;

public class Task1 {

    public static void main(String[] args) {

        for(int i = 1; i<=5; i++) {  //Row
            for (int j = 1; j <= i; j++) { //Col
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
