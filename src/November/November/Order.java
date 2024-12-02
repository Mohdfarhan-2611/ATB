package November.November;

public class Order {

    public static void main(String[] args) {

        int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};

        int index = 0;  // Index to place the negative number

        // Step 1: Move all negative numbers to the front
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) {
                // Swap using temp and explicit index
                int temp = arr[i];
                arr[i] = arr[index];
                arr[index] = temp;
                index++;
            }
        }

        // Step 2: Reverse the order of the positive numbers (starting from index)
        int start = index;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Print the final array
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
