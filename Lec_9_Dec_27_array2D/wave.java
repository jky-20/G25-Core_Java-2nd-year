package Lec_9_Dec_27_array2D;
import java.util.Scanner;

public class wave {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // wave pattern
        for(int col = 0 ; col < m ; col++){
            if(col % 2 == 0){
                for(int row = 0 ; row < n ; row++){
                    System.out.print(arr[row][col] + " ");
                }
            }
            else{
                for(int row=n-1 ; row >= 0 ; row--){
                    System.out.print(arr[row][col] + " ");
                }
            }
        }
    }
}
