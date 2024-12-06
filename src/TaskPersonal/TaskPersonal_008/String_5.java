package TaskPersonal.TaskPersonal_008;

public class String_5 {

    public static void ReverseString(String inputString)
    {
        char[] ch = inputString.toCharArray();
        int left = 0;
        int right = ch.length-1;

        while (left<right)
        {
            if (!Character.isLetter(ch[left]))
            {
                left++;
            } else if (!Character.isLetter(ch[right])) {
                right--;
            }
            else
            {
                char temp =   ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(String.valueOf(ch));
    }

    public static void main(String[] args) {

        ReverseString("abcdefg@#$%");
    }
}
