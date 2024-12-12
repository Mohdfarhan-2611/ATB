package November.November2;

public class Stringexp4 {

    public static void ReverseString(String inputString)
    {
        char[] ch = inputString.toCharArray();
        int left = 0;
        int right = inputString.length()-1;

        while(left<right)
        {
            if(!Character.isLetter(ch[left]))
            {
                left++;
            }
            else if (!Character.isLetter(ch[right]))
            {
                right--;
            }
            else
            {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        String result = String.valueOf(ch);
        System.out.println(result);

    }

    public static void main(String[] args)
    {
        ReverseString("abcdef@#$%");
    }
}
