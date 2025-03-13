package Coding5_Stringpractice;

public class Task3 {

    public static void main(String[] args) {
        int num = 4;
        int count = 1;
        for(int i=1; i<=num; i++){       //i=1   //2    //3
            if(i%2==0){
                for(int j=num; j>=1; j--)
                {
                    System.out.print(num*count);
                    count--;
                }
                count = count+num+1;
            }else{
                for(int j=1; j<=num; j++)
                {
                    System.out.print(num*count);
                    count++;
                }
                count = count+num-1;
            }
            System.out.println();
        }
    }
}
