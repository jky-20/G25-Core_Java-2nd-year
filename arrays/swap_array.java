package arrays;
public class swap_array {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
        swap(arr);
        // swap(arr[0], arr[2]);
        print(arr);
    }
    static void swap(int[] arr){
        int t = arr[0];
        arr[0] = arr[2];
        arr[2] = t;
    }
    static void swap(int a, int b){
        int t = a;
        a = b;
        b = t;
    }
    static void print(int[] arr){
        for(int i=0 ; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
