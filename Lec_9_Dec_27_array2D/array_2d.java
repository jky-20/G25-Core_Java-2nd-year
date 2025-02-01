package Lec_9_Dec_27_array2D;
import java.util.Scanner;

public class array_2d {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][3];

        int[][] static_arr = {{1,2,3},{2,3,4},{}};

        System.out.println(arr[1][3]);
        
        // Jagged array;
        int[][] arr_2d = new int[5][];

        // arr_2d[0] = new int[2];
        // arr_2d[1] = new int[3];
        
        for(int i=0 ; i<arr_2d.length ; i++){
            arr_2d[i] = new int[i+1];
        }

        for(int i=0 ; i<arr_2d.length ; i++){
            for(int j=0 ; j<arr_2d[i].length ; j++){
                System.out.print(arr_2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
