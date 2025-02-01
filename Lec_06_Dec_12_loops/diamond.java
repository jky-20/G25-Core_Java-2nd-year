package Lec_06_Dec_12_loops;
import java.util.Scanner;

public class diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (n+1)/2;

        for(int i=1 ; i<=m ; i++){
            for(int j=1 ; j<=m-i ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=m-1 ; i>0 ; i--){
            for(int j=1 ; j<=m-i ; j++){
                System.out.print(" ");
            }
            for(int j=1 ; j<=2*i-1 ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
