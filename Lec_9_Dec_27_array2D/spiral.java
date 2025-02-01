package Lec_9_Dec_27_array2D;

import java.util.Scanner;

public class spiral {
    
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

        int total = n*m;
        int top=0, bottom=n-1, left=0, right=m-1;

        for(int k=1 ; k<=total ;){
            // print top row;
            for(int i=left ; i<=right && k<=total ; i++,k++){
                System.out.print(arr[top][i] + " ");
            }
            top++;
            //print right col
            for(int i=top ; i<=bottom && k<=total ; i++,k++){
                System.out.print(arr[i][right] + " ");
            }
            right--;
            //print bottom row reverse order
            for(int i=right ; i>=left && k<=total ; i--,k++){
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;
            //print left col reverse order
            for(int i=bottom ; i>=top && k<=total ; i--,k++){
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }
    }
}
