package Task.Task_30092024;

public class Task002 {

    public static void main(String[] args) {

        int count=0;
        for(int i=2; i<=100; i++){
            if(i==2){
                System.out.println(i+" is prime");
                count++;
            }
            for(int j=2; j<i; j++){
                if(i%j==0){
                    break;
                }else if(j==i-1){
                    System.out.println(i+" is prime");
                    count++;
                    break;
                }
            }
        }
        System.out.println("Total prime 1 to 100 is "+count);

    }
}
