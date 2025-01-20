import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println(arr[1]);

        for(int i=0 ; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

        int largest = arr[0];

        // largest element in array
        for(int i=0 ; i<arr.length ; i++){

            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println(largest);

        // for(int i=0 ; i<arr.length ; i++){
        //     System.out.println(arr[i]);
        // }

        // int[] static_arr = {1,2,3};

        
    }
}
