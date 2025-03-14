package A_StringBuilder;

public class StringB {
    public static void main(String[] args) {

        String name = "Farhan";
        StringBuilder sb =new StringBuilder();
        System.out.println(sb.append(name));
        System.out.println(sb.toString());
        System.out.println(sb.indexOf(name));
        System.out.println(sb.insert(5,'X'));
        System.out.println(sb.reverse());
        System.out.println(String.valueOf(sb));



    }
}
