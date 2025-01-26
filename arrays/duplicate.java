package arrays;
import java.util.Scanner;

public class duplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int sum_n = (n*(n+1))/2;
        int sum_arr = 0;
        for(int val : arr){
            sum_arr += val;
        }

        int ans = sum_arr - sum_n;
        System.out.println("Repeated element is : " + ans);
    }
}
