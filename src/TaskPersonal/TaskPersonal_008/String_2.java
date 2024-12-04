package TaskPersonal.TaskPersonal_008;

import TaskPersonal.TaskPersonal_002.String.Reverse_word;

public class String_2 {

    public static void Reversewords(String inputString)
    {
        String[] str = inputString.split(" ");
        System.out.println(str.length);

        for(int i=str.length-1; i>=0; i--)
        {
            System.out.print(str[i]+ " ");
        }


    }


    public static void main(String[] args) {

        Reversewords("My Name Is Farhan");
    }
}
