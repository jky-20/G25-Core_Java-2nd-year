package Lec_31_Feb_27_OOPs;

import java.util.Arrays;
import java.util.Scanner;

class pair{
    int key;
    int val;
    pair(int key, int val){
        this.key = key;
        this.val = val;
    }
    @Override
    public String toString() {
        return ("key : " + key + " || value : " + val);
    }
}
public class question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pair[] arr = new pair[n];

        for(int i=0 ; i<n ; i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            arr[i] = new pair(key, val);
        }
        // sort using lamda expression
        Arrays.sort(arr, (p1, p2)->Integer.compare(p2.val, p1.val));
    }
}
