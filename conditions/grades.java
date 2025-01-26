package conditions;
import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grades = sc.nextInt();

        if(grades > 90){
            System.out.println("A");
        }
        else if(grades > 85 && grades <=90){
            System.out.println("A-");
        }
        else if(grades >= 80){
            System.out.println("B+");
        }
    }
}
