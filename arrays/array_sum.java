package arrays;
import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println(arr[1]);

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        // summ of array elements
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
        }

    }
}
