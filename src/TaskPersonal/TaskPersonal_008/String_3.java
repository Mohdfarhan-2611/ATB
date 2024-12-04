package TaskPersonal.TaskPersonal_008;

public class String_3 {

    public static void ReverseEach(String inputString)
    {   char[] ch = inputString.toCharArray();
        int left = 0;
        int right = inputString.length()-1;

        while (left<right) {
            if (ch[left] == ' ') {
                left++;
            } else if (ch[right] == ' ') {
                right++;
            } else {
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

        ReverseEach("I am a good student");


    }
}
