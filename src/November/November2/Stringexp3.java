package November.November2;

public class Stringexp3 {

    public static void ReverseString(String inutString)
    {
        char[] ch = inutString.toCharArray();
        int left = 0;
        int right = inutString.length()-1;

        while (left<right)
        {
            if (ch[left]==' ')
            {
                left++;
            }
            else if (ch[right] == ' ')
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

    public static void main(String[] args) {

        ReverseString("I am a good person");
    }
}
