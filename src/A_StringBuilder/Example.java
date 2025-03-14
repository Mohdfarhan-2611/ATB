package A_StringBuilder;

public class Example {


    public static void main(String[] args) {
        int iterator = 100000;
        long startTime;
        long endTime;

        String str = "";
        startTime = System.currentTimeMillis();
        for(int i=0; i<iterator; i++){
            str += "a";
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by String: " + (endTime - startTime) + " ms");


        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for(int i=0; i<iterator; i++){
            sb.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuilder: " + (endTime - startTime) + " ms");


        StringBuffer sf = new StringBuffer();
        startTime = System.currentTimeMillis();
        for(int i=0; i<iterator; i++){
            sf.append("a");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Time taken by StringBuffer: " + (endTime - startTime) + " ms");

    }
}
