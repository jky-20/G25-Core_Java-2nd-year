import java.util.Scanner;

public class set_matix_row_col_one {
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
        
        // Only one 1 is present

        // for(int i=0 ; i<arr.length ; i++){
        //     for(int j=0 ; j<arr[i].length ; j++){
        //         if(arr[i][j] == 1){
        //             row = i;
        //             col = j;
        //         }
        //     }
        // }

        // for(int i=0 ; i<arr[row].length ; i++){
        //     arr[row][i] = 1;
        // }
        // for(int i=0 ; i<arr.length ; i++){
        //     arr[i][col] = 1;
        // }

        // Code for Multiple 1's 

        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                if(arr[i][j] == 1){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        for(int i=0 ; i<row.length ; i++){
            if(row[i] == 1){
                for(int j=0 ; j<arr[i].length ; j++){
                    arr[i][j] = 1;
                }
            }
        }

        for(int j=0 ; j<col.length ; j++){
            if(col[j] == 1){
                for(int i=0 ; i<arr.length ; i++){
                    arr[i][j] = 1;
                }
            }
        }

        // Print array
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
