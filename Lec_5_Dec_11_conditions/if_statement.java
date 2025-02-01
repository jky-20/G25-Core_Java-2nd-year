package Lec_5_Dec_11_conditions;
import java.util.Scanner;
public class if_statement{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n % 2 == 0){
            System.out.println("n is a even no.");
        }
        else{
            System.out.println("n is an odd no.");
        }
    }
}