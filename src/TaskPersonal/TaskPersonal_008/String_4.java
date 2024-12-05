package TaskPersonal.TaskPersonal_008;

public class String_4 {

    public static void ReverseCharacter(String inputString)
    {
        char[] ch = inputString.toCharArray();
        int left = 0;
        int right = inputString.length()-1;

        while (left<right)
        {
            if(ch[left]==' ')
            {
                left++;
            } else if (ch[right]==' ') {
                right++;
            }
            else {
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

        ReverseCharacter("I am a good person");
    }
}
